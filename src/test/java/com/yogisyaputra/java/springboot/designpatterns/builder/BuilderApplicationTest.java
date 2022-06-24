package com.yogisyaputra.java.springboot.designpatterns.builder;

import com.yogisyaputra.java.springboot.designpatterns.prototype.PrototypeApplication;
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

@SpringBootTest(classes = BuilderApplication.class)
class BuilderApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testBuilderPrototype(){
        Product product = applicationContext.getBean("productGadget",Product.class);
        product.setName("Laptop 15 inc");

        System.out.println(product);
    }

}