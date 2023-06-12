package com.javalamdba;

public class TestLeftRight implements Left,Right{
    public void m1(){
        System.out.println("my own implementation..!");
        Left.super.m1();
    }
    public static void main(String[] args) {
        System.out.println("Test method..!");
        TestLeftRight t = new TestLeftRight();
        t.m1();
    }
}
