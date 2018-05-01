package com.ehr.webstore.service;

import com.ehr.webstore.domain.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer getCustomerById(String customerId);
}
