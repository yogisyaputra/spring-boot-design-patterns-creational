package com.yogisyaputra.java.springboot.designpatterns.factory.method;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Friday 24/06/2022
 */

@Getter
@Deprecated
public class FacebookSocialMedia implements SocialMedia{

    private final String name = "FACEBOOK";
    private final String link = "https://facebook.com";
    private final SocialMediaType type = SocialMediaType.FACEBOOK;
}
