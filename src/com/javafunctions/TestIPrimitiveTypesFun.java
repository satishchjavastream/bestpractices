package com.javafunctions;

import java.util.function.IntPredicate;

public class TestIntPredicate {
    public static void main(String[] args) {
        //System.out.println("He;looooo");
        int x[]={5,10,15,20,25};

        IntPredicate p = i->i%2==0;

        for (int x1:x){
           if (p.test(x1)) {
                System.out.println(x1+" : Even numbers");
            }

        }
    }
}
