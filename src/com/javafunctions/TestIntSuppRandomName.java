package com.javafunctions;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class TestIntSuppRandomName {
    public static void main(String[] args) {


        //Generate OPT Random number
        IntSupplier s = ()-> (int)(Math.random()*10);

            String opt = "";
            for (int i=0;i<6;i++){
                opt = opt + (int)(Math.random()*10);
            }


        System.out.println("opt 1 :"+opt);


    }
}
