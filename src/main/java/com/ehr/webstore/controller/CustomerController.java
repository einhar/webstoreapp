package com.ehr.webstore.controller;

import com.ehr.webstore.domain.expired.Customer_expired;
import com.ehr.webstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customers")
    public String list(Model model) {
        model.addAttribute("customers", customerService.getAllCustomers());
        return "customers";
    }

    @RequestMapping("/customer/C123")
    public String customer123(Model model) {
        model.addAttribute("customers",
                new ArrayList<Customer_expired>(Arrays.asList(customerService.getCustomerById("C123"))));
        return "customers";
    }

    @RequestMapping("/customer/C124")
    public String customer124(Model model) {
        Customer_expired customerExpired = customerService.getCustomerById("C124");
        model.addAttribute("customers", new ArrayList<Customer_expired>(Arrays.asList(customerExpired)));
        return "customers";
    }
}
