package com.javalamdba;

public class TestSquareRoot {
    public static void main(String[] args) {
        SquareRoot squareRoot = new SquareRootImpl();
        int num = 10;
        System.out.println("Square root of "+num+" is "+squareRoot.squareIt(num));

        int num1 = 20;
        SquareRoot squareRootLambda = n->(n*n);
        System.out.println("Square root of "+num1+" is "+squareRootLambda.squareIt(num1));
    }
}
