package com.javafunctions;

public class TestMethodRefThread {

    public void m1(){
        for (int i=0;i<10;i++){
            System.out.println("Child thread..!");
        }
    }
    public static void main(String[] args) {
        /*// Without Lambda expression
        Runnable r=()->{
            for (int i=0;i<10;i++){
                System.out.println("Child thread..!");
            }
        };

        Thread t = new Thread(r);
        t.start();

        for (int i=0;i<10;i++){
            System.out.println("Main thread..!");
        }*/

        TestMethodRefThread test = new TestMethodRefThread();
        Runnable r = test::m1;

        Thread t = new Thread(r);
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("Main thread..!");
        }

    }
}
