package com.example.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue
    private Integer vehicleId;
    private String brandCompany;

    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    @JsonIgnore
    private Employee employee;

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrandCompany() {
        return brandCompany;
    }

    public void setBrandCompany(String brandCompany) {
        this.brandCompany = brandCompany;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
