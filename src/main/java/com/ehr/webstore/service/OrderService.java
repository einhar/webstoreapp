package com.ehr.webstore.service;

import com.ehr.webstore.domain.Order;

public interface OrderService {

    void processOrder(String productId, long count);

    Long saveOrder(Order order);
}
