package com.ehr.webstore.domain.repository;

import com.ehr.webstore.domain.expired.Customer_expired;

import java.util.List;

public interface CustomerRepository {


    List<Customer_expired> getAllCustomers();

    Customer_expired getCustomerById(String customerId);
}
