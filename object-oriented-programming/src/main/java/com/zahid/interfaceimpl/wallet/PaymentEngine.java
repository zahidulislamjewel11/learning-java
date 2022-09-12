package com.zahid.interfaceimpl.wallet;

public class PaymentEngine {
    public void accept(Payment payment)
    {
        System.out.println("Accepting payment: "+payment.getAmount());
    }
}
