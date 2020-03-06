package com.example.springboot.model;

import org.hibernate.annotations.JoinColumnOrFormula;

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

    //Bidirectional
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
//    private List<Vehicle> vehicleList;


    //Unidirectional
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private List<Vehicle> vehicleList;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_product_list",
            joinColumns = @JoinColumn(name = "Eid", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "Pid", referencedColumnName = "productId"))
    private List<Product> productList;


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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", contact=" + contact +
                ", vehicleList=" + vehicleList +
                ", productList=" + productList +
                '}';
    }
}
