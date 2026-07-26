package com.coforge.sms.controller;

import java.util.List;
import java.util.Optional;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.coforge.sms.exception.SupplierNotFoundException;
import com.coforge.sms.model.Supplier;
import com.coforge.sms.model.Supplier;
import com.coforge.sms.service.SupplierService;

@RestController
@RequestMapping("/api/v1/sms")
public class SupplierController {

	private Environment environment;
	private SupplierService service;

	@Autowired
	public SupplierController(Environment environment, SupplierService service) {
		super();
		this.environment = environment;
		this.service = service;
	}
	
	@PostMapping("/suppliers")
	public ResponseEntity<String> saveSuppliers(@Valid @NotNull @RequestBody(required = false) Supplier supplier) {
		ResponseEntity<String> responseEntity = null;

		boolean status = service.saveSuppliers(supplier);
		if (status)
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.save.success"), HttpStatus.CREATED);

		return responseEntity;
	}
	
	@PutMapping("/suppliers/{sid}")
	public ResponseEntity<String> updateSuppliers(@Valid @NotNull @PathVariable("sid") long sid, @Valid @RequestBody Supplier supplier) {
		ResponseEntity<String> responseEntity = null;

		boolean status = service.updateSuppliers(sid, supplier);
		if (status)
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.update.success"), HttpStatus.CREATED);
		return responseEntity;
	}
	
	@DeleteMapping("/suppliers/{sid}")
	public ResponseEntity<String> deleteBySid(@Valid @PathVariable("sid") long sid) {
		ResponseEntity<String> responseEntity = null;

		boolean status = service.deleteBySid(sid);
		if (status)
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.delete.success"), HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/suppliers/{sid}")
	public ResponseEntity<?> findSuppById(@Valid @PathVariable("sid") long sid){
				
		Optional<Supplier> supplier = service.findSuppById(sid);
		
		return new ResponseEntity<>(supplier.get(),HttpStatus.OK);
	}
	
	@GetMapping("/suppliers")
	public ResponseEntity<?> findAll(){
				
		List<Supplier> suppliers = service.findAllSuppliers();
			
		return new ResponseEntity<>(suppliers,HttpStatus.OK);
	
	}

}
