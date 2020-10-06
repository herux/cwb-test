package com.herux.services;

import com.herux.repositories.EmployeeRepository;

import java.util.List;

import com.herux.models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployee() {
        List<Employee> listEmployee = repository.findAll();
        return listEmployee;
    }

    public void addEmployee(Employee employee) {
        repository.save(employee);
    }

    public void deleteEmployee(String employeeId) {
        repository.deleteById(employeeId);
    }

    public Employee updateEmployee(Employee employee) {
        return repository.save(employee);
    }

}
