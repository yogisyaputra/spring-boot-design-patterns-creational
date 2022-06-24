package com.yogisyaputra.java.springboot.designpatterns.factory.method;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Friday 24/06/2022
 */

@SpringBootTest(classes = FactotyMethodApplication.class)
class FactotyMethodApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactoryMethod(){
        SocialMedia facebook = applicationContext.getBean(SocialMedia.class,SocialMediaType.FACEBOOK);
        SocialMedia twitter = applicationContext.getBean(SocialMedia.class,SocialMediaType.TWITTER);

        System.out.println(facebook);
        System.out.println(twitter);
    }

}