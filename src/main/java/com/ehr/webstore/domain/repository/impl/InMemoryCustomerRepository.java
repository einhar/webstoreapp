package com.ehr.webstore.domain.repository.impl;

import com.ehr.webstore.domain.Customer;
import com.ehr.webstore.domain.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

    private List<Customer> listOfCustomers = new ArrayList<>();

    public InMemoryCustomerRepository() {
        Customer customer1 = new Customer("C123", "John", "NY");
        customer1.setNoOfOrdersMade(10);

        Customer customer2 = new Customer("C124", "Lisa", "Paris");
        customer2.setNoOfOrdersMade(50);

        listOfCustomers.add(customer1);
        listOfCustomers.add(customer2);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return listOfCustomers;
    }

    @Override
    public Customer getCustomerById(String customerId) {
        Customer customerById = null;
        for (Customer customer : listOfCustomers) {
            if (customer != null &&
                    customer.getCustomerId() != null &&
                    customer.getCustomerId().equals(customerId)) {
                customerById = customer;
                break;
            }
        }
        if (customerById == null) {
            throw new IllegalArgumentException("Customer with id: " + customerId + "does not exist.");
        }
        return customerById;
    }
}
