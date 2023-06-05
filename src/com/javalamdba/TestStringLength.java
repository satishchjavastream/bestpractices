package com.javalamdba;

public class TestStringLength {
    public static void main(String[] args) {

        StringLength sLenght = new StringLengthImpl();
        System.out.println("String length is : "+sLenght.getLenght("HelloWorld"));

        StringLength sLenghtLambda = s -> s.length();
        System.out.println("String Lenght is : "+sLenghtLambda.getLenght("Hello Lambda expression"));
    }
}
