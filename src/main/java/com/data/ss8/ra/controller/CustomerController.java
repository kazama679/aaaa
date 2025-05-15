package com.data.ss8.ra.controller;

import com.data.ss8.ra.model.Customer;
import com.data.ss8.ra.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("customer")
    public String findAll(Model model) {
        List<Customer> customers = customerService.findAll();
        System.out.println("customers size: " + customers.size());
        model.addAttribute("customers", customers);
        return "customer"; // file customer.jsp
    }

    @GetMapping("customer-add")
    public String add() {
        return "customer-add";
    }

    @PostMapping("customer-save")
    public String save(@RequestParam String fullname,
                       @RequestParam String email) {
        Customer customer = new Customer();
        customer.setFullName(fullname);
        customer.setEmail(email);
        return "customer-save";
    }
}