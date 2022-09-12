package com.zahid.account;
public class Account {
    private String name;
    private long amount;

    public Account(String name, long amount) {
//        this.name = name;
//        this.amount = amount;
        setName(name);
        setAmount(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
