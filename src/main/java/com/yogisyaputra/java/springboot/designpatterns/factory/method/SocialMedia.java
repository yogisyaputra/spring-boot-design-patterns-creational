package com.yogisyaputra.java.springboot.designpatterns.factory.method;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Friday 24/06/2022
 */
public interface SocialMedia {
    String getName();
    String getLink();
    SocialMediaType getType();

}
