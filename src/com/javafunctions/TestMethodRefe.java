package com.javafunctions;

public class TestMethodRefe {

    public static void m2(){
        System.out.println("Method Reference.. ");
    }
    public static void main(String[] args) {
        Interf i = ()->{
            System.out.println("Lambda implementation.");
        };
        i.m1();

        Interf ii = TestMethodRefe::m2;
        ii.m1();

    }
}
