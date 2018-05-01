package com.ehr.webstore.service.impl;

import com.ehr.webstore.domain.Product;
import com.ehr.webstore.domain.repository.ProductRepository;
import com.ehr.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
}
