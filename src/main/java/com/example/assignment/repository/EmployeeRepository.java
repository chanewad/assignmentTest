package com.example.assignment.repository;

import com.example.assignment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT e.country, e.totalEmployee FROM Employee e")
    Map<String, Integer> findEmployeesByCountry();

    @Query("SELECT e FROM Employee e WHERE LOWER(e.description) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    List<Employee> findBySearchTerm(@Param("searchTerm") String searchTerm);
}
