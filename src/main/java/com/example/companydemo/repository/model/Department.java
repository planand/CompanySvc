package com.example.companydemo.repository.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Accessors(chain = true)
@Table(name = "Department")
public class Department {

    @Id
    @Column(name = "deptId")
    private String id;

    @OneToMany
    private List<Employee> employees;

}

