package com.javafunctions;

import java.util.function.Function;

public class TestFunidentity {
    public static void main(String[] args) {
        String str= "Satish";

        Function<String,String> fun = Function.identity();

        System.out.println(str+" - "+fun.apply(str));
    }
}
