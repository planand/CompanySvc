package com.example.companydemo.repository;

import com.example.companydemo.repository.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, String> {

    Optional<Department> getDepartmentById(@Param("deptId") String deptId);

}
