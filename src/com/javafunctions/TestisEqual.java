package com.javafunctions;

import java.util.function.Predicate;

public class TestisEqual {
    public static void main(String[] args) {

        Predicate p = Predicate.isEqual("Satish");

        System.out.println("Equality : "+p.test("Satish"));
    }
}
