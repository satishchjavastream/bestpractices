package com.javafunctions;

import java.util.function.Consumer;

public class TestConsume {
    public static void main(String[] args) {
        Consumer<String> c = s->System.out.println(s);
        c.accept("Hello");
        c.accept("Satish");
    }
}
