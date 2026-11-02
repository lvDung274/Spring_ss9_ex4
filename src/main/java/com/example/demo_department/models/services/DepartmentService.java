package com.example.demo_department.models.services;

import com.example.demo_department.models.dto.req.DepartmentDTO;
import com.example.demo_department.models.entities.Department;

import java.util.List;

public interface DepartmentService {

    public List<Department> findAll();

    Department createDepartment(DepartmentDTO req);
}
