package com.coforge.sms.service;

import java.util.List;
import java.util.Optional;

import com.coforge.sms.model.Supplier;

public interface SupplierService {


	public boolean saveSuppliers(Supplier supplier);

	public boolean updateSuppliers(long sid, Supplier supplier);

	public Optional<Supplier> findSuppById(long sid);

	

	public boolean deleteBySid(long sid);

	public List<Supplier> findAllSuppliers();

}
