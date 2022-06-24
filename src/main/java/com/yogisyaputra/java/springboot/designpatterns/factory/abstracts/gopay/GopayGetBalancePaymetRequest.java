package com.yogisyaputra.java.springboot.designpatterns.factory.abstracts.gopay;

import com.yogisyaputra.java.springboot.designpatterns.factory.abstracts.GetBalancePaymentRequest;
import com.yogisyaputra.java.springboot.designpatterns.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Friday 24/06/2022
 */
public class GopayGetBalancePaymetRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
