package com.example.demo.stA;

import org.springframework.stereotype.Component;


public class Employee {

    int id;
    Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(int id, Address address) {
        this.id = id;
        this.address = address;
        this.address.getData();
    }

    public void job(){
        System.out.println("Completed");
    }
}
