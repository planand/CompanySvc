package com.example.companydemo.controller;

import com.example.companydemo.repository.model.Department;
import com.example.companydemo.service.CompanySvc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/company")
public class CompanyController {

    private CompanySvc companySvc;
    @GetMapping("/employee/dept/{deptId}")
    public Department findEmployeeByDeptId(String deptId) {
        return companySvc.findEmployeesByDept(deptId);
    }
}
