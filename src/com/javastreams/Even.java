package com.javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Even {
    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        al.add(30);
        al.add(35);
        al.add(40);
        al.add(45);
        al.add(50);

        System.out.println("List of elements :"+al);

        for (Integer i:al){
            if(i%2==0){
                System.out.println("Even numbers :"+i);
            }
        }

        List<Integer> evenNumbers = al.stream().filter(i->i%2==0).collect(Collectors.toList());

        System.out.println("stream filtered even numbers :"+evenNumbers);


        //Double the array element in an arraylist
        ArrayList<Integer> doubleElements = new ArrayList<>();
        for (Integer i : al){
            doubleElements.add(i*2);
        }
        System.out.println("double elements :"+doubleElements);

        List<Integer> doubleArraySt = al.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println("Double elements from stream :"+doubleArraySt);


    }
}
