package com.javalamdba;

import java.util.ArrayList;
import java.util.Collections;

public class SortingTest {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);

        System.out.println("Before sorting :"+l);
        // Default sorting order. Comparable - ascending order

        //Without using Java 8 - Lamada expressions
        Collections.sort(l);
        System.out.println("After sorting :"+l);

        // Customised sorting  - descending order
        Collections.sort(l,new MyComparator());
        System.out.println("After sorting custom sorting DESC :"+l);

        //With using Java 8 - Lamada expressions

        Collections.sort(l,(o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
        System.out.println("After sorting custom sorting DESC - LAmada expression:"+l);
    }
}
