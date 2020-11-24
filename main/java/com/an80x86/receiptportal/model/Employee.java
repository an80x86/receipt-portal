package com.an80x86.receiptportal.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="name")
    private String name;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private String phone;
    @Column(name="active")
    private boolean active;

    public Employee(String name, String lastName, String email, String phone, boolean active) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.active = active;
    }
}