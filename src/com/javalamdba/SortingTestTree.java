package com.javalamdba;

import java.util.TreeSet;

public class SortingTestTree {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(10);
        t.add(0);
        t.add(5);
        t.add(25);
        t.add(15);
        //Default sorting order. Comparable - ascending order
        System.out.println("Default sorting :"+t);

        //Customised sorting - DESC order
        TreeSet<Integer> t1 = new TreeSet<Integer>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
        t1.add(10);
        t1.add(0);
        t1.add(5);
        t1.add(25);
        t1.add(15);
        System.out.println("Customised sorting using lambda expression - Java 8:"+t1);

    }
}
