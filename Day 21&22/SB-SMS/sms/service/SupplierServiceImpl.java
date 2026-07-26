package com.coforge.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.coforge.sms.exception.SupplierNotFoundException;
import com.coforge.sms.model.Supplier;
import com.coforge.sms.repo.SupplierRepo;

@Service
public class SupplierServiceImpl implements SupplierService {

    private SupplierRepo repo;
    private Environment environment;

    @Autowired
    public SupplierServiceImpl(SupplierRepo repo, Environment environment) {
        this.repo = repo;
        this.environment = environment;
    }

    @Override
    public boolean saveSuppliers(Supplier supplier) {
        repo.save(supplier);
        return true;
    }

    @Override
    public boolean updateSuppliers(long sid, Supplier supplier) {

        if (!repo.existsById(sid)) {
            throw new SupplierNotFoundException(
                    environment.getProperty("sms.invalid.supplier-notfound"));
        }

        supplier.setSid(sid);     // Replace sid with your entity's primary key setter
        repo.save(supplier);
        return true;
    }

    @Override
    public boolean deleteBySid(long sid) {

        if (!repo.existsById(sid)) {
            throw new SupplierNotFoundException(
                    environment.getProperty("sms.invalid.supplier-notfound"));
        }

        repo.deleteById(sid);
        return true;
    }

    @Override
    public Optional<Supplier> findSuppById(long sid) {

        Optional<Supplier> supplier = repo.findById(sid);

        if (supplier.isEmpty()) {
            throw new SupplierNotFoundException(
                    environment.getProperty("sms.get.failed"));
        }

        return supplier;
    }

    @Override
    public List<Supplier> findAllSuppliers() {
        return (List<Supplier>) repo.findAll();
    }


}