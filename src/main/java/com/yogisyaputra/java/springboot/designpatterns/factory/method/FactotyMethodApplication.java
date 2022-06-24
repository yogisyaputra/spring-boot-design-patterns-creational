package com.yogisyaputra.java.springboot.designpatterns.factory.method;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Friday 24/06/2022
 */

@SpringBootApplication
public class FactotyMethodApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMedia(SocialMediaType type){
        if (type == SocialMediaType.FACEBOOK)
//            return new FacebookSocialMedia();
            return new FacebookV2SocialMedia();
        else if (type == SocialMediaType.TWITTER)
            return new TwitterSocialMedia();
        else
            throw new IllegalArgumentException("Unsupported Social Media Type");
    }
}
