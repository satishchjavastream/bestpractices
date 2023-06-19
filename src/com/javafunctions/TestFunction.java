package com.javafunctions;

import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
        // Program to find length of the String by using function.
        String str = "Hello";

        Function<String,Integer> fun = s->s.length();

        System.out.println("Length of the String is :"+fun.apply(str));

        // Program to find a number of spaces present in the given string by using function.
        String str1 = "Hello this is functional programing";
        Function<String,String> funStr = s->s.replace(" ","");
        System.out.println("Final String :"+funStr.apply(str1));

        // Program to find length of the string without spaces.
        Function<String,Integer> funInt = s-> s.length() - s.replaceAll(" ","").length();
        System.out.println("Final length of the string :"+funInt.apply(str1));
    }
}
