package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import com.coforge.pms.model.Product;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public interface ProductService {

	public boolean saveProduct(Product product);
	
	public boolean updateProduct(long pid,Product product);
	
	public boolean deleteProduct(long pid);
	
	public Optional<Product> findById(long pid);
	
	public List<Product> findAllProducts();
	

	
	public List<Product> findByPprice(double pprice);
	
	public List<Product> findByPname(String pname);

	public boolean deleteByPname(String pname);

	public String getInfoList();

	List<Product> findByPquantity(int pquantity);


	

}
