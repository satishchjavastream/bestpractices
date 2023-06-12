package com.javalamdba;

public class TestLambdavariables {
    int x = 10;
    public void m2(){
        int y =20;  // This is final variable , Method level local variable are final , We can not change it.
        Inter i = ()->{
            x= 888;
           // y= 999;
            System.out.println(x); // class variable we can access
            System.out.println(y); // method variable we can access
        };
        i.m1();
    }

    public static void main(String[] args) {
        TestLambdavariables t = new TestLambdavariables();
        t.m2();
    }
}
