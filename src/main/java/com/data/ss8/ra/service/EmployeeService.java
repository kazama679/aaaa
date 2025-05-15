package com.data.ss8.ra.service;

import com.data.ss8.ra.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    boolean save(Employee employee);
}
