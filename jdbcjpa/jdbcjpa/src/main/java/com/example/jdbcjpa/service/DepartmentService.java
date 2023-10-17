package com.example.jdbcjpa.service;

import com.example.jdbcjpa.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);
    List<Department> fetchDepartmentList();
}
