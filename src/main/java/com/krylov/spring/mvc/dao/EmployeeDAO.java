package com.krylov.spring.mvc.dao;

import com.krylov.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}
