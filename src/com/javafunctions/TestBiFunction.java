package com.javafunctions;

import java.util.function.BiFunction;

public class TestBiFunction {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> bifun = (a,b)->a*b;

        System.out.println(bifun.apply(10,20));
        System.out.println(bifun.apply(100,200));
    }
}
