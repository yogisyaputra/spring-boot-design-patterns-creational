package com.yogisyaputra.java.springboot.designpatterns.factory.abstracts;

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

@SpringBootTest(classes = AbstrackFactoryApplication.class)
class AbstrackFactoryApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testAbstractFactory(){
        PaymentFactory paymentFactoryCreditCard = applicationContext.getBean(CreditCardPaymentFactory.class);
        PaymentFactory paymentFactoryGopay = applicationContext.getBean(GopayPaymentFactory.class);

        charge(paymentFactoryCreditCard);
        charge(paymentFactoryGopay);


    }

    public void charge(PaymentFactory paymentFactory){
        ChargePaymentRequest request = paymentFactory.craeteChargeRequest();
        request.setAmount(1000_000L);
        request.setId("xxx");

        System.out.println(request);
    }

    public void cancel(PaymentFactory paymentFactory){
        CancelPaymentRequest request = paymentFactory.craeteCancelRequest();
        request.setId("XXX");

        System.out.println(request);
    }

    public Long getBalance(PaymentFactory paymentFactory){
        GetBalancePaymentRequest request = paymentFactory.craeteGetBalanceRequest();
        request.setUserId("xxx");
        System.out.println(request);
        return  1000L;
    }

}