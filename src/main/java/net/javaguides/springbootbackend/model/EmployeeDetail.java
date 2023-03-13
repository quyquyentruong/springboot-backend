package net.javaguides.springbootbackend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "employees_detail")
public class EmployeeDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "emp_id")
    private String empId;

    @Column(name = "class_name")
    private String className;

    @Column(name = "gpa")
    private String gpa;
}
