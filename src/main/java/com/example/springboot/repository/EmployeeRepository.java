package com.example.springboot.repository;

import com.example.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //Employee findByName(String name);

    //Employee findByNameAndDepartment(String name, String department);
}
