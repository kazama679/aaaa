package com.data.ss8.ra.repository;

import com.data.ss8.ra.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();
    boolean save(Employee employee);
}
