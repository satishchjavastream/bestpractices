package com.javalamdba;

public class TestStatic {
    public static void main(String[] args) {
        TestStatic t = new TestStatic();
       // t.m1(); This will give error
       // TestStatic.m1(); Thi will give error
        InterfStatic.m1();
    }
}
