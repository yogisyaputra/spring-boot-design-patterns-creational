package com.yogisyaputra.java.springboot.designpatterns.factory.inheritance;

import com.yogisyaputra.java.springboot.designpatterns.factory.method.SocialMedia;
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
@SpringBootTest(classes = FactoryInheritanceApplication.class)
class FactoryInheritanceApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactoryInheritance(){
        SocialMedia facebook = applicationContext.getBean("socialMediaFacebook",SocialMedia.class);
        SocialMedia twitter = applicationContext.getBean("socialMediaTwitter",SocialMedia.class);

        System.out.println(facebook);
        System.out.println(twitter);
    }
}