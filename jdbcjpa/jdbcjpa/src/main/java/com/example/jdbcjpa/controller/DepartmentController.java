package com.example.jdbcjpa.controller;

import com.example.jdbcjpa.entity.Department;
import com.example.jdbcjpa.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/get")
    public List<Department> getDepartment(){
        return departmentService.fetchDepartmentList();
    }
}
