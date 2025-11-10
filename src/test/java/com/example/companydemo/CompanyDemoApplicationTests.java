package com.example.companydemo;

import com.example.companydemo.repository.DepartmentRepo;
import com.example.companydemo.repository.EmployeeRepo;
import com.example.companydemo.repository.model.Department;
import com.example.companydemo.repository.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jpa.test.autoconfigure.TestEntityManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//@SpringBootTest
@DataJpaTest
class CompanyDemoApplicationTests {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private DepartmentRepo deptRepo;

    @Autowired
    private TestEntityManager entityManager;


    @Test
    void contextLoads() {
    }

    @Test
    public void testEmployees() {

        System.out.println("Test");
        Employee emp1 = new Employee()
                .setEmpName("n1")
                .setId("e1");

        Employee emp2 = new Employee()
                .setEmpName("n2")
                .setId("e2");

        Employee emp3 = new Employee()
                .setEmpName("n3")
                .setId("e3");

        Employee emp4 = new Employee()
                .setEmpName("n4")
                .setId("e4");

        List<Employee> employees = new ArrayList<>(Arrays.asList(emp1, emp2));
        Department dept = new Department("d1", employees);


        List<Employee> employeeList2 = new ArrayList<>(Arrays.asList(emp3, emp4));
        Department dept2 = new Department("d2", employeeList2);

        entityManager.persist(emp1);
        entityManager.persist(emp2);
        entityManager.persist(dept);

        entityManager.persist(emp3);
        entityManager.persist(emp4);
        entityManager.persist(dept2);
        Optional<Employee> e1o = employeeRepo.findById("e1");
        Assertions.assertNotNull(e1o.get());
        Assertions.assertEquals(e1o.get().getEmpName(), (emp1.getEmpName()));

        Optional<Department> d1 = deptRepo.findById("d1");
        Assertions.assertEquals(d1.get(), dept);
    }
}


/**
 * resource "aws_lambda_funciton" "lambda1"{
 * function_name = "l1"
 * handler = "f1.handler"
 * role = ""
 * runtime = "nodejs22.x"
 * filename = "${path.module}/deployment/
 * }
 */