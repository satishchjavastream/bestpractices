package com.javafunctions;

import java.util.function.BiConsumer;

public class TestBiConsumer {
    public static void main(String[] args) {
        BiConsumer<String,String> biCon = (s1,s2)-> System.out.println(s1+s2);

        biCon.accept("Satish ","Chitimoju");
    }
}
