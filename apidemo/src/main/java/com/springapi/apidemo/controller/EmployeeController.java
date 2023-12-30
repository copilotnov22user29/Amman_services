package com.springapi.apidemo.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.apidemo.model.Employee;
import com.springapi.apidemo.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;
   
    @GetMapping("/employees")
    public List<Employee> getEmployee() {
        Collection<Employee> employees = employeeRepository.getEmployee().values();
       return new ArrayList<>(employees);
         
    }

}
