package com.example.jdbcjpa.service;

import com.example.jdbcjpa.Enums.Departments;
import com.example.jdbcjpa.entity.Department;
import com.example.jdbcjpa.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    DepartmentRepository departmentRepository;
    @Value("${department.suffix}")
    private String departmentSuffix;
    @Override
    public Department saveDepartment(Department dep) {
        dep.setName(Departments.valueOf(dep.getName()).getValue()+"_"+departmentSuffix);
        return departmentRepository.save(dep);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }
}
