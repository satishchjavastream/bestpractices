package com.javafunctions;

import java.util.Scanner;
import java.util.function.Predicate;

public class User {
    String userName;
    String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static void main(String[] args) {
        Predicate<User> checkUser=user->user.userName.equals("Satish") && user.password.equals("Password");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the use name:");
        String name= sc.next();
        System.out.print("Enter the password:");
        String pwd = sc.next();

        User user = new User(name,pwd);
        if(checkUser.test(user)){
            System.out.println("Valid user..!");
        }else{
            System.out.println("Not a valid user..!");
        }

    }
}
