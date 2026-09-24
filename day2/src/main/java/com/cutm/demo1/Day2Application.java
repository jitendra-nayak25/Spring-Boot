package com.cutm.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Day2Application {

    public static void main(String[] args) {

        ApplicationContext ioc = SpringApplication.run(Day2Application.class, args);

        EmployeeRepo empRepo = ioc.getBean(EmployeeRepo.class);

        Employee e1 = new Employee();
        e1.setId(100);
        e1.setName("ABCD");

        empRepo.save(e1);
    }
}