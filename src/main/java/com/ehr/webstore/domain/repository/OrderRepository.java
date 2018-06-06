package com.ehr.webstore.domain.repository;

import com.ehr.webstore.domain.Order;

public interface OrderRepository {

    Long saveOrder(Order order);
}
