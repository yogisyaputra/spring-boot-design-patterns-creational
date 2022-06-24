package com.yogisyaputra.java.springboot.designpatterns.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Thursday 23/06/2022
 */
class ProductTest {

    @Test
    void testBuilder(){
        Product product = Product.builder()
                .id("xxx")
                .name("iPhone")
                .sku("yyy")
                .price(20_000_000L)
                .build();
        System.out.println(product.toString());
    }

}