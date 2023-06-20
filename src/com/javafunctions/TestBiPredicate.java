package com.javafunctions;

import java.util.function.BiPredicate;

public class TestBiPredicate {
    public static void main(String[] args) {

        BiPredicate<Integer,Integer> bip = (t,u)->(t+u)%2==0;
        System.out.println(bip.test(10,20));
        System.out.println(bip.test(20,15));
    }
}
