package com.javafunctions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {

        Predicate<Integer> p = i->i>10;
        System.out.println(p.test(100)); // True
        System.out.println(p.test(5)); // False
       //System.out.println(p.test("sam")); // Error - incompatible types: java.lang.String cannot be converted to java.lang.Integer

        //Given length of the string is 5 or not ?
        Predicate<String> ps = s->s.length()>5;
        System.out.println(ps.test("abcdef"));// True
        System.out.println(ps.test("abc"));// False

        // Given array list is empty or not ?
        Predicate<Collection> pc = c->c.isEmpty();
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        System.out.println(pc.test(al));
        ArrayList<Integer> al1=new ArrayList<>();
        System.out.println(pc.test(al1));


        // Predicate joining - Understanding negate() , and() and or();
        int[] x = {0,5,10,15,20,25,30,35,40,45,50};
        Predicate<Integer> p1 = i -> i>10;
        Predicate<Integer> p2 = i -> i%2 ==0;
        System.out.println("The number greater than 10 or not");
        m(p1,x);
        System.out.println("The even number or not ?");
        m(p2,x);
        System.out.println("The number not greater than 10");
        m(p1.negate(),x);
        System.out.println("The number odd numbers");
        m(p2.negate(),x);
        System.out.println("The numbers greater than 10 and even numbers");
        m(p1.and(p2),x);
        System.out.println("The numbers less than 10 and odd numbers");
        m(p1.negate().and(p2.negate()),x);
        System.out.println("The numbers greater than 10 or even numbers");
        m(p1.or(p2),x);


        //In a given array, print all Names start with "K".
        String[] names = {"Sam","Karthik","Kamesh","Khan","King","Kendy","Satish"};
        Predicate<String> startwithK = s->s.charAt(0)=='K';
        System.out.println("Print strings start with K ");
        for (String s:names){
            if(startwithK.test(s)){
                System.out.println(s);
            }
        }

        //Skip not null and not empty strings in an array and print remaining element in an array.
        String[] persons = {"Ravi",null,"","Satish","Rajesh","",null,"Sam",""};
        Predicate<String> checknotNull = s-> s!=null && s.length()!=0;
        System.out.println("Print all the valid strings from the list");
        for (String person : persons){
            if(checknotNull.test(person)){
                System.out.println(person);
            }
        }

        //Valid user or not ?
    }

    private static void m(Predicate<Integer> p, int[] x) {
        for (int x1:x){
            if(p.test(x1))
            System.out.println("Check the result :"+x1);
        }
    }
}
