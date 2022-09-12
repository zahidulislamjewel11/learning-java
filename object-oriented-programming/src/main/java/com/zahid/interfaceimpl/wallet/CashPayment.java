package com.zahid.interfaceimpl.wallet;
public class CashPayment implements Payment {
    @Override
    public long getAmount() {
        System.out.println("Taking cash payment");
        return 500;
    }
}
