package com.an80x86.receiptportal.service;

import java.util.List;

import com.an80x86.receiptportal.model.Employee;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(long id);

}