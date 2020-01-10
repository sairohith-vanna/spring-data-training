package com.experimental.data.controllers;

import com.experimental.data.models.Employee;
import com.experimental.data.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeDataController {

    @Autowired
    public EmployeeRepository employeeRepository;

    @PostMapping("create")
    public void createNewEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
    }
}