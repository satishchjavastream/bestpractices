package com.javafunctions;

import java.util.function.Predicate;

public class BankCustomer {
    String name;
    int age;
    boolean isHavingDoc;
    public BankCustomer(String name, int age, boolean isHavingDoc) {
        this.name = name;
        this.age = age;
        this.isHavingDoc = isHavingDoc;
    }

    @Override
    public String toString() {
        return "BankCustomer{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        BankCustomer[] bankcustomers = {
                new BankCustomer("Ravi",25,true),
        new BankCustomer("Ramesh",40,true),
        new BankCustomer("Rajesh",60,false),
        new BankCustomer("Satish",20,true),
        new BankCustomer("Rajesh",17,true)
        };

        Predicate<BankCustomer> checkBankCustomer = bc -> bc.age > 18 && bc.isHavingDoc == true;
        System.out.println("Below customers are eligible for bank account: ");
        for (BankCustomer bankcustomer: bankcustomers){
            if (checkBankCustomer.test(bankcustomer)){
                System.out.println(bankcustomer);
            }
        }
    }
}
