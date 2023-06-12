package com.javalamdba;

public interface InterDefault {
    default void m1(){
        System.out.println("default method..!");
    }
}
