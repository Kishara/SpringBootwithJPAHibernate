package com.example.springboot.service;

import com.example.springboot.model.Contact;
import com.example.springboot.model.Employee;
import com.example.springboot.model.Vehicle;
import com.example.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    @Override
    public void addEmployee(Employee employee){
        Contact contact = employee.getContact();
        contact.setEmployee(employee);

        for(Vehicle vehicle: employee.getVehicleList()){
            vehicle.setEmployee(employee);
        }
        employeeRepository.save(employee);
    }
}
