package com.example.springboot.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String department;

    @OneToOne (cascade = CascadeType.ALL, mappedBy = "employee")
    private Contact contact;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private List<Vehicle> vehicleList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", contact=" + contact +
                ", vehicleList=" + vehicleList +
                '}';
    }
}
