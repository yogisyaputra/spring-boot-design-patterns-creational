package com.yogisyaputra.java.springboot.designpatterns.factory.inheritance;

import com.yogisyaputra.java.springboot.designpatterns.factory.method.FacebookV2SocialMedia;
import com.yogisyaputra.java.springboot.designpatterns.factory.method.SocialMedia;
import com.yogisyaputra.java.springboot.designpatterns.factory.method.TwitterSocialMedia;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Friday 24/06/2022
 */

@SpringBootApplication
public class FactoryInheritanceApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaFacebook(){
        return new FacebookV2SocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTwitter(){
        return new TwitterSocialMedia();
    }
}
