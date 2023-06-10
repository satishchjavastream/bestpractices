package com.javalamdba;

public class TestAnonyInnerLambda {
    public static void main(String[] args) {
    //Anonymous inner class
       /* Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println("Child thread..!!!");
                }
            }
        };*/
    //Lambda expression
        /* Runnable r = () -> {
                for (int i=0;i<10;i++){
                    System.out.println("Child thread..!!!");
                }
         };*/

    //Lambda expression
        Thread t = new Thread(() -> {
            for (int i=0;i<10;i++){
                System.out.println("Child thread..!!!");
            }
        });
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("Main thread..!!!");
        }

    }
}
