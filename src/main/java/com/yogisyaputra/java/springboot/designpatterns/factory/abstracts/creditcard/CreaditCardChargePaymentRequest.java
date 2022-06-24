package com.yogisyaputra.java.springboot.designpatterns.factory.abstracts.creditcard;

import com.yogisyaputra.java.springboot.designpatterns.factory.abstracts.ChargePaymentRequest;
import com.yogisyaputra.java.springboot.designpatterns.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Friday 24/06/2022
 */

public class CreaditCardChargePaymentRequest implements ChargePaymentRequest {

    @Setter
    @Getter
    private String id;

    @Setter
    @Getter
    private Long amount;

    @Override
    public Long getFee() {
        return getAmount() *5/100;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }


}
