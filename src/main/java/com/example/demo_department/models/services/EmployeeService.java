package com.example.demo_department.models.services;

import com.example.demo_department.models.dto.req.EmployeeCreateDTO;
import com.example.demo_department.models.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee createEmployee(EmployeeCreateDTO req);
}
