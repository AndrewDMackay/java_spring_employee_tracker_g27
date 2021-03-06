
package com.codeclan.example.employee_tracker.controllers;

import com.codeclan.example.employee_tracker.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.codeclan.example.employee_tracker.repositeries.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

        @Autowired
        EmployeeRepository employeeRepository;

        @GetMapping(value = "/employees")
        public List<Employee> getAllEmployees(){
            return employeeRepository.findAll();
        }

        @GetMapping(value = "/employees/{id}")
        public Optional<Employee> getEmployee(@PathVariable Long id){
            return employeeRepository.findById(id);
        }
    }

