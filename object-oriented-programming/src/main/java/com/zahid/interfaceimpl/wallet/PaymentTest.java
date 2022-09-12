package com.zahid.interfaceimpl.wallet;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentEngine paymentEngine = new PaymentEngine();
        BKashPayment bKashPayment = new BKashPayment();
        RocketPayment rocketPayment = new RocketPayment();
        CashPayment cashPayment = new CashPayment();

        paymentEngine.accept(bKashPayment);
        paymentEngine.accept(rocketPayment);
        paymentEngine.accept(cashPayment);
    }
}
