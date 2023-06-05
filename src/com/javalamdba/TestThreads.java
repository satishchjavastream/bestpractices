package com.javalamdba;

public class TestThreads {
    public static void main(String[] args) {
      /*  Runnable r = new com.javalamdba.MyRun();
        Thread t = new Thread(r);
        t.start();

        for (int i=0;i<10;i++){
            System.out.println("Main Thread..!!!");
        }*/


        Runnable r1 = ()->{
            for (int i=0;i<10;i++){
                System.out.println("Child thread.!!!");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        for (int i=0;i<10;i++){
            System.out.println("Main Thread..!!!");
        }
    }
}
