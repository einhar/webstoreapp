package com.ehr.webstore.service;

import com.ehr.webstore.domain.expired.Customer_expired;

import java.util.List;

public interface CustomerService {

    List<Customer_expired> getAllCustomers();

    Customer_expired getCustomerById(String customerId);
}
