package com.example.companydemo.repository.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Accessors(chain = true)
@Table(name = "Employee")
public class Employee extends AbstractAudit {
    @ManyToOne
    @JoinColumn(name = "deptId") // Specifies the foreign key column
    private Department department;

    @Id
    private String id;

    @Column
    private String EmpName;

    @Column
    private int age;
}