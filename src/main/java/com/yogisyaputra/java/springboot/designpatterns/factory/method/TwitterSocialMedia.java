package com.yogisyaputra.java.springboot.designpatterns.factory.method;

import lombok.Getter;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Friday 24/06/2022
 */

@Getter
public class TwitterSocialMedia implements SocialMedia{

    private final String name = "TWITTER";
    private final String link = "https://twitter.com";
    private final SocialMediaType type = SocialMediaType.TWITTER;
}
