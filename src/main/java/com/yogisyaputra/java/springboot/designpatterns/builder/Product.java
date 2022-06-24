package com.yogisyaputra.java.springboot.designpatterns.builder;

import lombok.*;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Thursday 23/06/2022
 */

@Builder
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Product {
    private String id;
    private String name;
    private String sku;
    private Long price;
    private Category category;
}
