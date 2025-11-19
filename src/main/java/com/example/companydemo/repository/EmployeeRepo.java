package com.example.companydemo.repository;

import com.example.companydemo.repository.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {

    @Query(value = "select * from employees order by age desc", nativeQuery = true)
    List<Employee> findAllEmployeesOrderByMaxAge();
}
