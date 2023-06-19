package com.javafunctions;

import java.util.function.Function;

public class TestFunandThenCompose {
    public static void main(String[] args) {
        Function<String,String> fun = str->str.toUpperCase();
        Function<String,String> fun1 =str->str.substring(0,6);
        Function<String,String> fun2 = str->str.concat("Rashmika");

        System.out.println(fun.apply("Satish"));
        System.out.println(fun1.apply("SatishSamanta"));

        System.out.println(fun.andThen(fun1).andThen(fun2).apply("SatishSamanta"));
        System.out.println(fun.compose(fun1).apply("SatishSamanta"));

        Function<Integer,Integer> fsum = i->i+i;
        Function<Integer,Integer> fmul = i-> i* i * i;  //

        System.out.println(fsum.andThen(fmul).apply(2)); //2+2 = 4  and then 4*4*4 = 64 // Output: 64
        System.out.println(fsum.compose(fmul).apply(2)); //2*2*2=8 and then 8+8 = 16 // Output: 16

    }
}
