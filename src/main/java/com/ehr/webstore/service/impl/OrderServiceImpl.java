package com.ehr.webstore.service.impl;

import com.ehr.webstore.domain.Product;
import com.ehr.webstore.domain.repository.ProductRepository;
import com.ehr.webstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void processOrder(String productId, int count){
        Product productById = null;
        productById = productRepository.getProductById(productId);
        if (productById.getUnitsInStock() < count) {
            throw new IllegalArgumentException("There is no enough article in warehouse. Current number in stock: " + productById.getUnitsInStock());
        }
        productById.setUnitsInStock(productById.getUnitsInStock() - count);
    }
}
