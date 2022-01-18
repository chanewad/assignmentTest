package com.example.assignment.service;

import com.example.assignment.entity.Employee;
import com.example.assignment.repository.EmployeeRepository;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.ejb.HibernateEntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SessionFactory sessionFactory;

    @Bean
    public SessionFactory sessionFactory(EntityManagerFactory entityManagerFactory) {
        return entityManagerFactory.unwrap(SessionFactory.class);
    }

    public List<Employee> getEmployees(){
        return (List<Employee>) employeeRepository.findAll();
    }

    public Map<String, Integer> findEmployeesByCountry(){
        return (Map<String, Integer>) employeeRepository.findEmployeesByCountry();
    }

    public List<Employee> findBySearchTerm(String searchTerm){
        //Criteria cr = sessionFactory.createCriteria(Employee.class);
        return (List<Employee>) sessionFactory.getCurrentSession().createQuery("from Employee e WHERE LOWER(e.description) LIKE LOWER(CONCAT('%', :searchTerm, '%'))").list();
    }
}
