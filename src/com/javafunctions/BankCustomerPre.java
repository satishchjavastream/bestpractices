package com.javafunctions;

import java.util.function.Predicate;

public class BankCustomerPre {
    String name;
    int age;
    boolean isHavingDoc;
    public BankCustomerPre(String name, int age, boolean isHavingDoc) {
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

        BankCustomerPre[] bankcustomers = {
                new BankCustomerPre("Ravi",25,true),
        new BankCustomerPre("Ramesh",40,true),
        new BankCustomerPre("Rajesh",60,false),
        new BankCustomerPre("Satish",20,true),
        new BankCustomerPre("Rajesh",17,true)
        };

        Predicate<BankCustomerPre> checkBankCustomer = bc -> bc.age > 18 && bc.isHavingDoc == true;
        System.out.println("Below customers are eligible for bank account: ");
        for (BankCustomerPre bankcustomer: bankcustomers){
            if (checkBankCustomer.test(bankcustomer)){
                System.out.println(bankcustomer);
            }
        }
    }
}
