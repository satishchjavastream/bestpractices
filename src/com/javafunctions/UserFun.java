package com.javafunctions;

import java.util.Scanner;
import java.util.function.Function;

public class UserFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter user name :");
        String userName = sc.next();
        System.out.print("Enter password :");
        String password=sc.next();

        Function<String,String> fun = s->s.substring(0,6);
        Function<String,String > fun1 = s->s.toLowerCase();

        if(fun.andThen(fun1).apply(userName).equals("satish") && password.equals("p12345!")){
            System.out.println("Valid user..!");
        }else {
            System.out.println("Invalid user..!");
        }
    }
}
