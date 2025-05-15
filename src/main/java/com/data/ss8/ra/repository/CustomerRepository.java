package com.data.ss8.ra.repository;

import com.data.ss8.ra.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
