package com.coforge.pms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.pms.dto.ProductDTO;
import com.coforge.pms.dto.SupplierDTO;
import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;
import com.coforge.pms.service.client.SupplierClient;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/v1/pms")
public class ProductController {

	private ProductService service;
	private Environment environment;
	@Autowired
	private SupplierClient supplierClient;
	
	
	@Autowired
	public ProductController(ProductService service, Environment environment,SupplierClient supplierclient) {
		super();
		this.service = service;
		this.environment = environment;
		this.supplierClient = supplierclient;
	}
	
	@PostMapping("/products")
	public ResponseEntity<String> saveProduct(@NotNull @Valid @RequestBody(required = false) Product product){
		ResponseEntity<String> responseEntity = null;
		
		boolean status = service.saveProduct(product);
		if(status) {
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.save.success"),HttpStatus.CREATED);
		}
		return responseEntity;
	}
	
	@PutMapping("/products/{pid}")
	public ResponseEntity<String> updateProduct(@PathVariable long pid, @Valid @NotNull @RequestBody Product product){
		
		ResponseEntity<String> responseEntity = null;
		
		boolean status = service.updateProduct(pid,product);
		if(status) {
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.update.success"),HttpStatus.CREATED);
		}
		return responseEntity;
	}
	
	@DeleteMapping("/products/{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable("pid") int pid){
		
		ResponseEntity<String> responseEntity = null;
		
		boolean status = service.deleteProduct(pid);
		if(status) {
			responseEntity = new ResponseEntity<>(environment.getProperty("pms.delete.success"),HttpStatus.CREATED);
		}
		return responseEntity;
		
	}
	
	@GetMapping("/products/{pid}")
	public ResponseEntity<?> findById(@PathVariable("pid") long pid){
		
		ResponseEntity<?> responseEntity = null;
		
		Optional<Product> product = service.findById(pid);
		if(product!=null) {
			responseEntity = new ResponseEntity<>(product.get(),HttpStatus.CREATED);
		}
		return responseEntity;
	}
	
	@GetMapping("/products")
	public ResponseEntity<?> findAllProducts(){
		
		ResponseEntity<?> responseEntity = null;
		List<Product> products = service.findAllProducts();
		responseEntity = new ResponseEntity<>(products,HttpStatus.CREATED);
		return responseEntity;
	}
	
	@GetMapping("/products/supplier/{pid}")
	public ResponseEntity<ProductDTO> findProductDetails(@PathVariable("pid") long pid) {

	    Optional<Product> product = service.findById(pid);

	    SupplierDTO supplier =
	            supplierClient.findSupplierById(product.get().getSupid());

	    ProductDTO dto = new ProductDTO();
	    dto.setProduct(product.get());
	    dto.setSupplier(supplier);

	    return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	@GetMapping("/products/{pid}/supplier")
	public ResponseEntity<ProductDTO> findProductSupplier(@PathVariable("pid") long pid) {

	    Optional<Product> product = service.findById(pid);

	    SupplierDTO supplier =
	            supplierClient.findSupplierById(product.get().getSupid());

	    ProductDTO dto = new ProductDTO();
	    dto.setProduct(product.get());
	    dto.setSupplier(supplier);

	    return ResponseEntity.ok(dto);
	}
	
}
