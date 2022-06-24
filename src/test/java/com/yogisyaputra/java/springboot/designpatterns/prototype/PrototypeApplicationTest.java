package com.yogisyaputra.java.springboot.designpatterns.prototype;

import com.yogisyaputra.java.springboot.designpatterns.singleton.SingletonApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Thursday 23/06/2022
 */
@SpringBootTest(classes = PrototypeApplication.class)
class PrototypeApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototype(){
        Employee eko = applicationContext.getBean("employeeStaff",Employee.class);
        eko.setName("EKO");

        Employee budi = applicationContext.getBean("employeeManager",Employee.class);
        budi.setName("BUDI");

        System.out.println(eko);
        System.out.println(budi);
    }
}