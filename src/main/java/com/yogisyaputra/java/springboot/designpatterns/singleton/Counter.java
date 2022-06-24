package com.yogisyaputra.java.springboot.designpatterns.singleton;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Thursday 23/06/2022
 */
public class Counter {
    private Long value = 0l;

    public Long getValue() {
        return value;
    }

    public synchronized void increment(){
        value++;
    }
}
