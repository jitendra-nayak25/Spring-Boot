package com.avengers.jitendra;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

public interface EmployeeRepo {

    List<Employee> findByName(String name);
    List<Employee> findByAddress(String address);
}
