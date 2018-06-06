package com.ehr.webstore.service.impl;

import com.ehr.webstore.domain.expired.Customer_expired;
import com.ehr.webstore.domain.repository.CustomerRepository;
import com.ehr.webstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer_expired> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    @Override
    public Customer_expired getCustomerById(String customerId) {
        return customerRepository.getCustomerById(customerId);
    }
}
