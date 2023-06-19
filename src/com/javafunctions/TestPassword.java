package com.javafunctions;

import java.util.function.Supplier;

public class TestPassword {
    public static void main(String[] args) {

    Supplier<String> s=()-> {
            Supplier < Integer > digits = () -> (int) (Math.random() * 10);
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
        Supplier<Character> characters = () -> symbols.charAt((int) Math.random() * 29);
        String password = "";

        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) {
                password = password + digits.get();
            } else {
                password = password + characters.get();
            }
        }
        return password;
    };

        System.out.println("Random password 1 :"+s.get());
        System.out.println("Random password 2 :"+s.get());
        System.out.println("Random password 3 :"+s.get());
        System.out.println("Random password 4 :"+s.get());
        System.out.println("Random password 5 :"+s.get());
        System.out.println("Random password 6 :"+s.get());
        System.out.println("Random password 7 :"+s.get());
        System.out.println("Random password 8 :"+s.get());
    }
}
