package com.javafunctions;

import java.util.Date;
import java.util.function.Supplier;

public class TestSuppDate {
    public static void main(String[] args) {

        Supplier<Date> s=()->new Date();

        System.out.println("Date is given below :"+s.get());
    }
}
