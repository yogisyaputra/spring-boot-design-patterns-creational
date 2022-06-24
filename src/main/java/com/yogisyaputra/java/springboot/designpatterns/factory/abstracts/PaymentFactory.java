package com.yogisyaputra.java.springboot.designpatterns.factory.abstracts;

/**
 * @author Yogi Syaputra @ysyaputra
 * @project SPRING BOOT DESIGN PATTERNS - CREATIONAL
 * @created Friday 24/06/2022
 */
public interface PaymentFactory {
    ChargePaymentRequest craeteChargeRequest();
    CancelPaymentRequest craeteCancelRequest();
    GetBalancePaymentRequest craeteGetBalanceRequest();

}
