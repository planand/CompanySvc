package com.example.companydemo.controller;

import com.example.companydemo.configProperties.ServerProperties;
import com.example.companydemo.repository.model.Department;
import com.example.companydemo.service.CompanySvc;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanySvc companySvc;

    @Autowired
    private ServerProperties serverProperties;

    @GetMapping("/employee/dept/{deptId}")
    public Department findEmployeeByDeptId(String deptId) {
        return companySvc.findEmployeesByDept(deptId);
    }

    @GetMapping("/serverProperties")
    public ServerProperties getServerProperties(){
        return serverProperties;
    }

}
