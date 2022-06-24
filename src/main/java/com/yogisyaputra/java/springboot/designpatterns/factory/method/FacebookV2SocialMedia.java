package com.yogisyaputra.java.springboot.designpatterns.factory.method;

import lombok.Getter;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Friday 24/06/2022
 */

@Getter
public class FacebookV2SocialMedia implements SocialMedia{

    private final String name = "FACEBOOK";
    private final String link = "https://facebook.com";
    private final SocialMediaType type = SocialMediaType.FACEBOOK;
}
