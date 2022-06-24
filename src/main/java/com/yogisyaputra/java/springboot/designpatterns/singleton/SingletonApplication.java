package com.yogisyaputra.java.springboot.designpatterns.singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Thursday 23/06/2022
 */

@SpringBootApplication
public class SingletonApplication {

    // Create Singleton
    @Bean
    public Counter counter(){
        return new Counter();
    }
}
