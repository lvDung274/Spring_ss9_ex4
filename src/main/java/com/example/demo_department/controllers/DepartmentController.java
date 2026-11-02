package com.example.demo_department.controllers;

import com.example.demo_department.models.dto.req.DepartmentDTO;
import com.example.demo_department.models.dto.response.ApiResponse;
import com.example.demo_department.models.entities.Department;
import com.example.demo_department.models.services.DepartmentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(departmentService.findAll());
    }
    @PostMapping
    public ResponseEntity<ApiResponse<Department>> createDepartment(@Valid @RequestBody DepartmentDTO req) {
        Department createdDepartment = departmentService.createDepartment(req);

        ApiResponse<Department> apiResponse = ApiResponse.<Department>builder()
                .status("SUCCESS")
                .message("Tạo phòng ban thành công")
                .data(createdDepartment)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(apiResponse);
    }

}
