package com.yogisyaputra.java.springboot.designpatterns.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Thursday 23/06/2022
 */
@Setter
@Getter
@ToString
public class Employee {
    private String id;
    private String name;
    private Position position;
    private Long salary;
}
