package com.ehr.webstore.domain.repository.impl;

import java.util.HashMap;
import java.util.Map;

import com.ehr.webstore.domain.repository.OrderRepository;
import org.springframework.stereotype.Repository;
import com.ehr.webstore.domain.Order;

@Repository
public class InMemoryOrderRepository implements OrderRepository {

    private Map<Long, Order> listOfOrders;
    private long nextOrderId;

    public InMemoryOrderRepository() {
        listOfOrders = new HashMap<Long, Order>();
        nextOrderId = 1000;
    }

    public Long saveOrder(Order order) {
        order.setOrderId(getNextOrderId());
        listOfOrders.put(order.getOrderId(), order);
        return order.getOrderId();
    }

    private synchronized long getNextOrderId() {
        return nextOrderId++;
    }
}
