package com.javafunctions;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserPre {
    String userName;
    String password;

    public UserPre(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static void main(String[] args) {
        Predicate<UserPre> checkUser= user->user.userName.equals("Satish") && user.password.equals("Password");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the use name:");
        String name= sc.next();
        System.out.print("Enter the password:");
        String pwd = sc.next();

        UserPre user = new UserPre(name,pwd);
        if(checkUser.test(user)){
            System.out.println("Valid user..!");
        }else{
            System.out.println("Not a valid user..!");
        }

    }
}
