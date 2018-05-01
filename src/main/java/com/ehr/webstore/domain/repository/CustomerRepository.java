package com.ehr.webstore.domain.repository;

import com.ehr.webstore.domain.Customer;

import java.util.List;

public interface CustomerRepository {


    List<Customer> getAllCustomers();

    Customer getCustomerById(String customerId);
}
