package com.herux.controllers;

import java.util.List;

import com.herux.models.Employee;
import com.herux.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apis")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getAll() {
        return employeeService.getAllEmployee();
    }

    @PostMapping("/employee")
    public Employee addEmployee(@Validated Employee employee) {
        employeeService.addEmployee(employee);
        return employee;
    }

    @PostMapping("/employee/update")
    public Employee update(@Validated Employee employee) {
        Employee employeeUpdated = employeeService.updateEmployee(employee);
        return employeeUpdated;
    }

    @PostMapping("/employee/delete")
    public String removeEmployee(@RequestParam(required = true) String employeeId) {
        employeeService.deleteEmployee(employeeId);
        return "Success";
    }

}
