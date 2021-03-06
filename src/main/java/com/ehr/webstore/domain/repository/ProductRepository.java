package com.ehr.webstore.domain.repository;

import com.ehr.webstore.domain.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProductRepository {

    List<Product> getAllProducts();

    Product getProductById(String productId);

    List<Product> getProductsByCategory(String category);

    Set<Product> getProductByFilter(Map<String, List<String>> filterParams);

    void addProduct(Product product);
}
