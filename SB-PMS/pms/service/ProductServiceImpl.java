package com.coforge.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.coforge.pms.exception.ProductNotFoundException;
import com.coforge.pms.model.Product;
import com.coforge.pms.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepo repo;
    private Environment environment;

    public ProductServiceImpl(ProductRepo repo, Environment environment) {
        this.repo = repo;
        this.environment = environment;
    }

    @Override
    public boolean saveProduct(Product product) {
        repo.save(product);
        return true;
    }

    @Override
    public boolean updateProduct(long pid, Product product) {

        if (!repo.existsById((long)pid)) {
            throw new ProductNotFoundException(
                    environment.getProperty("pms.invalid.product-notFound"));
        }

        product.setPid(pid);   // Make sure Product has setPid()
        repo.save(product);

        return true;
    }

    @Override
    public boolean deleteProduct(long pid) {

        if (!repo.existsById((long)pid)) {
            throw new ProductNotFoundException(
                    environment.getProperty("pms.invalid.product-notFound"));
        }

        repo.deleteById((long)pid);
        return true;
    }

    @Override
    public Optional<Product> findById(long pid) {

        Optional<Product> product = repo.findById(pid);

        if (product.isEmpty()) {
            throw new ProductNotFoundException(
                    environment.getProperty("pms.invalid.product-notFound"));
        }

        return product;
    }

    @Override
    public List<Product> findAllProducts() {
        return (List<Product>) repo.findAll();
    }

	@Override
	public List<Product> findByPprice(double pprice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByPname(String pname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteByPname(String pname) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getInfoList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByPquantity(int pquantity) {
		// TODO Auto-generated method stub
		return null;
	}




}