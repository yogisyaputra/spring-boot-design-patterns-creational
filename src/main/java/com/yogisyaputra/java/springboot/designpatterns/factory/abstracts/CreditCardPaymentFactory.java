package com.yogisyaputra.java.springboot.designpatterns.factory.abstracts;

import com.yogisyaputra.java.springboot.designpatterns.factory.abstracts.creditcard.CreaditCardCancelPaymentRequest;
import com.yogisyaputra.java.springboot.designpatterns.factory.abstracts.creditcard.CreaditCardChargePaymentRequest;
import com.yogisyaputra.java.springboot.designpatterns.factory.abstracts.creditcard.CreaditCardGetBalancePaymetRequest;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Friday 24/06/2022
 */

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory{
    @Override
    public ChargePaymentRequest craeteChargeRequest() {
        return new CreaditCardChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest craeteCancelRequest() {
        return new CreaditCardCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest craeteGetBalanceRequest() {
        return new CreaditCardGetBalancePaymetRequest();
    }
}
