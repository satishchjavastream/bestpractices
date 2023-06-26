package com.javafunctions;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class TestUnaryOpe {
    public static void main(String[] args) {

        UnaryOperator<Integer> u = i->i*i;
        System.out.println("output :"+u.apply(20));

        IntUnaryOperator iu = i->i*i;
        System.out.println("U out :"+iu.applyAsInt(30));
    }
}
