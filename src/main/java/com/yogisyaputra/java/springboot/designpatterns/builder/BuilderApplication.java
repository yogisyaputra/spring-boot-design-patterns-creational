package com.yogisyaputra.java.springboot.designpatterns.builder;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Thursday 23/06/2022
 */

@SpringBootApplication
public class BuilderApplication {

    @Bean
    @Scope("prototype")
    public Product productGadget(){
        return Product.builder()
                .category(Category.GADGET)
                .build();
    }

    @Bean
    @Scope("prototype")
    public Product productFashion(){
        return Product.builder()
                .category(Category.FASHION)
                .build();
    }
}
