package com.data.ss8.ra.controller;

import com.data.ss8.ra.model.Employee;
import com.data.ss8.ra.model.Product;
import com.data.ss8.ra.service.EmployeeService;
import com.data.ss8.ra.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("employees")
    public String findAll(Model model) {
        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employees", employees);
        return "bai6";
    }

    @GetMapping("employees/add")
    public String add() {
        return "bai6Add";
    }

    @PostMapping("/employees/save")
    public String save(@RequestParam String name,
                       @RequestParam String email,
                       @RequestParam String position) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setEmail(email);
        employee.setPosition(position);
        boolean result = employeeService.save(employee);
        if (result) {
            return "redirect:/employees";
        }else{
            return "error";
        }
    }
}
