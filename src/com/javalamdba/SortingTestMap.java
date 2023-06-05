package com.javalamdba;

import java.util.TreeMap;

public class SortingTestMap {
    public static void main(String[] args) {
        TreeMap<Integer,String > map = new TreeMap<Integer,String >();
        map.put(100,"ramesh");
        map.put(600,"harish");
        map.put(300,"rajesh");
        map.put(200,"kamesh");
        map.put(700,"satish");
        map.put(400,"suresh");

        //Default sorting order. Comparable - ascending order
        //Without using Java 8 - Lamada expressions
        System.out.println("Default sorting :"+map);


        TreeMap<Integer,String > map1 = new TreeMap<Integer,String >((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
        map1.put(100,"ramesh");
        map1.put(600,"harish");
        map1.put(300,"rajesh");
        map1.put(200,"kamesh");
        map1.put(700,"satish");
        map1.put(400,"suresh");

        //customised sorting order.  - DESC order
        //With using Java 8 - Lamada expressions
        System.out.println("Customised sorting - Java 8 - Lamada expressions :"+map1);

    }
}
