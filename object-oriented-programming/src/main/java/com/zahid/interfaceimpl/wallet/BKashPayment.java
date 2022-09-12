package com.zahid.interfaceimpl.wallet;

public class BKashPayment implements Payment {
    @Override
    public long getAmount() {
        System.out.println("Taking BKash Payment");
        return 100;
    }
}
