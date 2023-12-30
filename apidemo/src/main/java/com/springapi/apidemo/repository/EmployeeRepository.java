package com.springapi.apidemo.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springapi.apidemo.model.Employee;

@Repository
public class EmployeeRepository {
    public static HashMap<Integer, Employee> empRepo = new HashMap<>();

    public Map<Integer, Employee> getEmployee() {
        return empRepo;
    }

    static {
        empRepo.put(1, new Employee(1, "John", "New York", 10000));
        empRepo.put(2, new Employee(2, "Smith", "London", 20000));
        empRepo.put(3, new Employee(3, "Ravi", "Mumbai", 30000));
    }


    
}
