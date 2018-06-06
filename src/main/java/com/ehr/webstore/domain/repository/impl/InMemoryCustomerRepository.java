package com.ehr.webstore.domain.repository.impl;

import com.ehr.webstore.domain.expired.Customer_expired;
import com.ehr.webstore.domain.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

    private List<Customer_expired> listOfCustomerExpireds = new ArrayList<>();

    public InMemoryCustomerRepository() {
        Customer_expired customerExpired1 = new Customer_expired("C123", "John", "NY");
        customerExpired1.setNoOfOrdersMade(10);

        Customer_expired customerExpired2 = new Customer_expired("C124", "Lisa", "Paris");
        customerExpired2.setNoOfOrdersMade(50);

        listOfCustomerExpireds.add(customerExpired1);
        listOfCustomerExpireds.add(customerExpired2);
    }

    @Override
    public List<Customer_expired> getAllCustomers() {
        return listOfCustomerExpireds;
    }

    @Override
    public Customer_expired getCustomerById(String customerId) {
        Customer_expired customerExpiredById = null;
        for (Customer_expired customerExpired : listOfCustomerExpireds) {
            if (customerExpired != null &&
                    customerExpired.getCustomerId() != null &&
                    customerExpired.getCustomerId().equals(customerId)) {
                customerExpiredById = customerExpired;
                break;
            }
        }
        if (customerExpiredById == null) {
            throw new IllegalArgumentException("Customer_expired with id: " + customerId + "does not exist.");
        }
        return customerExpiredById;
    }
}
