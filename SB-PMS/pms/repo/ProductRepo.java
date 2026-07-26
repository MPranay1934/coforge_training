package com.coforge.pms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.pms.model.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long>{

	public List<Product> findByPquantity(int pquantity);

	public List<Product> findByPprice(double pprice);
	
	public List<Product> findByPname(String pname);
	
	 public String deleteByPname(String pname);
	

}
