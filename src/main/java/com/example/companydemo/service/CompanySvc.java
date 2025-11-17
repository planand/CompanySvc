package com.example.companydemo.service;

import com.example.companydemo.repository.DepartmentRepo;
import com.example.companydemo.repository.model.Department;
import com.example.companydemo.service.mobile.Sim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanySvc {

    @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    @Qualifier("MP1")
    private Sim sim1;

    @Autowired
    @Qualifier("MP2")
    private Sim sim2;

    public Department findEmployeesByDept(String deptId){
       Optional<Department> department = departmentRepo.getDepartmentById(deptId);
       return department.orElse(null);
    }

    public void getProvider(String provider){
        Sim sim = provider.equals("mp1") ? sim1 : sim2;
        sim.calling();
        sim.data();
    }
}
