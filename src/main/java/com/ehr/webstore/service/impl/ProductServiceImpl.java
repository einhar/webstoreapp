package com.ehr.webstore.service.impl;

import com.ehr.webstore.domain.Product;
import com.ehr.webstore.domain.repository.ProductRepository;
import com.ehr.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public Product getProductById(String productId) {
        return productRepository.getProductById(productId);
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        return productRepository.getProductsByCategory(category);
    }

    @Override
    public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
        return productRepository.getProductByFilter(filterParams);
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }
}
