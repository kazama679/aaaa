package com.data.ss8.ra.service;

import com.data.ss8.ra.model.Employee;
import com.data.ss8.ra.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public boolean save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
