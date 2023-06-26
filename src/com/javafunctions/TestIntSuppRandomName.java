package com.javafunctions;

import java.util.function.Supplier;

public class TestSuppRandomName {
    public static void main(String[] args) {

        //Generate Random Name.
        Supplier<String> s=()->{
            String[] str = {"Satish", "Ravi", "Ramesh", "Jhon", "Alex"};
            int i=(int)(Math.random()*4); // Random number from 0 to 3;
            return str[i];
        };

        System.out.println("Random name 1:"+s.get());
        System.out.println("Random name 2:"+s.get());
        System.out.println("Random name 3:"+s.get());
        System.out.println("Random name 4:"+s.get());
        System.out.println("Random name 5:"+s.get());

        //Generate OPT Random number
        Supplier<String> sopt = ()->{
            String opt = "";
            for (int i=0;i<6;i++){
                opt = opt + (int)(Math.random()*10);
            }
            return opt;
        };
        System.out.println("opt 1 :"+sopt.get());
        System.out.println("opt 2 :"+sopt.get());
        System.out.println("opt 3 :"+sopt.get());
        System.out.println("opt 4 :"+sopt.get());
        System.out.println("opt 5 :"+sopt.get());

    }
}
