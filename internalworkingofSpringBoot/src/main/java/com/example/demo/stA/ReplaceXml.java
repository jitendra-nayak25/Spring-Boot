package com.example.demo.stA;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo.stA")
public class ReplaceXml {

    @Bean(name = {"e2","e3"})
    public Employee employee(){
        return new Employee(100,getAddress());
    }

    @Bean
    public Address getAddress(){
        return new Address();
    }

}
