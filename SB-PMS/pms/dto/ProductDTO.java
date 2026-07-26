package com.coforge.pms.dto;

import com.coforge.pms.model.Product;

public class ProductDTO {

    private Product product;
    private SupplierDTO supplier;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public SupplierDTO getSupplier() {
        return supplier;
    }

    public void setSupplier(SupplierDTO supplier) {
        this.supplier = supplier;
    }
}