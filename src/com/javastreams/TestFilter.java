package com.javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFilter {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Satish");
        l.add("RameshKumar");
        l.add("sam");
        l.add("Ramachandra");
        l.add("KumarSwami");
        System.out.println("Array List: "+l);

        // Filter and collect(Collectors.toList());
        List<String> l1= l.stream().filter(s->s.length()>=9).collect(Collectors.toList());
        System.out.println("Filtered output :"+l1);

        // Map and collect(Collectors.toList())
        List<String> l2 = l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println("Upper case names: "+l2);

        long count = l.stream().filter(s->s.length()>=9).count();
        System.out.println("count of the names which is >=9 : "+count);

        List<Integer> listOfnums = new ArrayList<>();
        listOfnums.add(51);
        listOfnums.add(2);
        listOfnums.add(10);
        listOfnums.add(30);
        listOfnums.add(4);
        listOfnums.add(53);
        listOfnums.add(1);

        System.out.println("List of elements :"+listOfnums);
        List<Integer> sortedNums = listOfnums.stream().sorted().collect(Collectors.toList());
        System.out.println("List of sorted elements :"+sortedNums);

        List<Integer> sortedNumdec = listOfnums.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("List of sorted elements in desc :"+sortedNumdec);

       int minVal = listOfnums.stream().min((i1,i2)->i1.compareTo(i2)).get();
       int maxVal = listOfnums.stream().max((i1,i2)->i1.compareTo(i2)).get();

        System.out.println("Min Value :"+minVal+" Max value :"+maxVal);

        l.stream().forEach(s-> System.out.println(s));

        l.stream().forEach(System.out::println);

        Integer[] arrayInt = listOfnums.stream().toArray(Integer[]::new);

        for (Integer i:arrayInt){
            System.out.println("Valie of the i :"+i);
        }

        Stream<Integer> s = Stream.of(9,99,999,9999,99999);
        s.forEach(System.out::println);

        Double[] d= {10.0,10.1,10.2,10.3,10.4};
        Stream<Double> dd = Stream.of(d);
        dd.forEach(System.out::println);
    }
}
