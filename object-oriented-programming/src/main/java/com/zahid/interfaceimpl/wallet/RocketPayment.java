package com.zahid.interfaceimpl.wallet;

public class RocketPayment implements Payment {
    @Override
    public long getAmount() {
        System.out.println("Taking Rocket payment");
        return 200;
    }
}
