package com.javafunctions;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class TestBinaryOpe {

    public static void main(String[] args) {
        BinaryOperator<String> b = (s1,s2) -> s1+s2;
        System.out.println("It is the binary operatoer to sum :"+b.apply("Satish"," chitimoju"));

        IntBinaryOperator bint = (i1,i2)->(i1+i2);
        System.out.println("sum is :"+bint.applyAsInt(10,20));
    }
}
