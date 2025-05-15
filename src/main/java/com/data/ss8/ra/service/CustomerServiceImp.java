package com.data.ss8.ra.service;

import com.data.ss8.ra.model.Customer;
import com.data.ss8.ra.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {
    @Autowired
    private CustomerRepository customerRepo;

    @Override
    public List<Customer> findAll() {
        return customerRepo.findAll();
    }
}