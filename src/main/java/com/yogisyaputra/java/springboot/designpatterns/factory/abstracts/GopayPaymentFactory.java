package com.yogisyaputra.java.springboot.designpatterns.factory.abstracts;

import com.yogisyaputra.java.springboot.designpatterns.factory.abstracts.creditcard.CreaditCardCancelPaymentRequest;
import com.yogisyaputra.java.springboot.designpatterns.factory.abstracts.creditcard.CreaditCardChargePaymentRequest;
import com.yogisyaputra.java.springboot.designpatterns.factory.abstracts.creditcard.CreaditCardGetBalancePaymetRequest;
import com.yogisyaputra.java.springboot.designpatterns.factory.abstracts.gopay.GopayCancelPaymentRequest;
import com.yogisyaputra.java.springboot.designpatterns.factory.abstracts.gopay.GopayChargePaymentRequest;
import com.yogisyaputra.java.springboot.designpatterns.factory.abstracts.gopay.GopayGetBalancePaymetRequest;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Friday 24/06/2022
 */

@Configuration
public class GopayPaymentFactory implements PaymentFactory{
    @Override
    public ChargePaymentRequest craeteChargeRequest() {
        return new GopayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest craeteCancelRequest() {
        return new GopayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest craeteGetBalanceRequest() {
        return new GopayGetBalancePaymetRequest();
    }
}
