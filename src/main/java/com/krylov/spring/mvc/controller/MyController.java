package com.krylov.spring.mvc.controller;

import com.krylov.spring.mvc.dao.EmployeeDAO;
import com.krylov.spring.mvc.dao.EmployeeDAOImpl;
import com.krylov.spring.mvc.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class MyController {
    @Autowired
    private EmployeeDAO employeeDAO;
    @RequestMapping(name = "/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeDAO.getAllEmployees();
        model.addAttribute("allEmployees", allEmployees);
        return "all-employees";
    }
}
