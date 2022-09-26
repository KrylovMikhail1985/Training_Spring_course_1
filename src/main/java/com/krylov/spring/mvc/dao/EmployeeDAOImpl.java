package com.krylov.spring.mvc.dao;

import com.krylov.spring.mvc.SF;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.krylov.spring.mvc.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {

        Session session = sessionFactory.getCurrentSession();
        Query<Employee> queue = session.createQuery("from Employee", Employee.class);
        List<Employee> allEmployees = queue.getResultList();

        return allEmployees;
    }
}
