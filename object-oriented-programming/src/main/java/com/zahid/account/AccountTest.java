package com.zahid.account;
public class AccountTest {
    public static void main(String[] args) {
        Account fixed = new Account("Fixed Desposit", 120_000);
        SavingAccount saving = new SavingAccount(45_000);


        System.out.println(fixed);
        System.out.println(saving);
        System.out.println();
        System.out.println(fixed.getName()+" "+fixed.getAmount());
        System.out.println(saving.getName()+" "+saving.getAmount());
    }
}
