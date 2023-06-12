package com.javalamdba;

public class TestAnonyInnerLambdae {
    int x=888;
   /* public void m2(){
    Inter i = new Inter() {
        int x=999; // instance variable for Anonymous inner class
        @Override
        public void m1() {
            System.out.println("value of x :"+this.x); // output is 999 , using THIS keyword we can call inner class members, outer class members are local variable.
        }
    };
    i.m1();
    }*/

    public void m2(){
        Inter i = ()->{
            int x=999;
            System.out.println("Value of x: "+this.x);//out is 888. using THIS keyword we can call outer class members, inner class members are local variable.
        };
        i.m1();
    }
    public static void main(String[] args) {
        TestAnonyInnerLambdae t = new TestAnonyInnerLambdae();
        t.m2();
    }
}
