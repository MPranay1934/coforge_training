package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import com.coforge.pms.exception.InvalidProductObjectException;
import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Product;

public interface ProductService {
	public boolean saveProduct(Product product) throws InvalidProductObjectException;

	public boolean updateProduct(int productId, Product product);

	public boolean deleteProductById(int productId);

	public Optional<Product> findByPid(int productId);

	public Iterable<Product> findAllProducts();

	public List<Product> findByproductName(String productName);

	public boolean deleteByProductName(String productName);

	List<Product> findByproductQuantity(int productQuantity);

	List<Product> findByPriceRange(double minPrice, double maxPrice);

	List<Integer> getproductIdsList();

	String getInfo();

}