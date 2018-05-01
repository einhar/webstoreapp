package com.ehr.webstore.domain.repository;

import com.ehr.webstore.domain.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAllProducts();

    Product getProductById(String productId);
}
