package com.yogisyaputra.java.springboot.designpatterns.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Thursday 23/06/2022
 */
@SpringBootApplication
public class PrototypeApplication {

    @Bean
    @Scope("prototype")
    public Employee employeeStaff(){
        Employee employee = new Employee();
        employee.setPosition(Position.STAFF);
        employee.setSalary(10_000_000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeManager(){
        Employee employee = new Employee();
        employee.setPosition(Position.MANAGER);
        employee.setSalary(30_000_000L);
        return employee;
    }
}
