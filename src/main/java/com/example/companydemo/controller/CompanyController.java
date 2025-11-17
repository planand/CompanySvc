package com.example.companydemo.controller;

import com.example.companydemo.configProperties.server.SProps;
import com.example.companydemo.repository.model.Department;
import com.example.companydemo.service.CompanySvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanySvc companySvc;

    @Autowired
    private SProps serverProperties;

    @GetMapping("/employee/dept/{deptId}")
    public Department findEmployeeByDeptId(@PathVariable String deptId) {
        return companySvc.findEmployeesByDept(deptId);
    }

    @GetMapping("/serverProperties")
    public SProps getServerProperties(){
        return serverProperties;
    }

    //Eg: /company/mobileProvider?provider=mp1
    @GetMapping("/mobileProvider")
    public void getSim(@RequestParam String provider){
        companySvc.getProvider(provider);
    }

}
