package com.example.companydemo.service;

import com.example.companydemo.repository.DepartmentRepo;
import com.example.companydemo.repository.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanySvc {

    @Autowired
    private DepartmentRepo departmentRepo;

    public Department findEmployeesByDept(String deptId){
       Optional<Department> department = departmentRepo.getDepartmentById(deptId);
       return department.orElse(null);
    }
}
