package com.javastreams;

import javax.xml.crypto.Data;
import java.util.*;
import java.util.stream.Collectors;

public class MapVsReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,4,5,6,7,8);


        int sum = numbers.stream().mapToInt(i -> i).sum();
        System.out.println("sum :"+sum);

        Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("reducer Sum :"+reduceSum);

        Integer reducerwithMetherReference = numbers.stream().reduce(Integer::sum).get();
        System.out.println("reducer with method reference :"+reducerwithMetherReference);

        Integer max = numbers.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println("Max value :"+max);

        Integer maxwithmref = numbers.stream().reduce(Integer::max).get();
        System.out.println("Max with Refer sum :"+maxwithmref);

        Integer mul = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Multiplication of numbers :"+mul);

        List<String> names = Arrays.asList("Spring","Hibernate","AWS","Java","Devops");
        String lenthyWorld = names.stream().reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
        System.out.println("Lengthy world: "+lenthyWorld);

        double averageSalary = Databse.getEmp().stream()
                .filter(e -> e.getGrade().equalsIgnoreCase("A"))
                .map(e -> e.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();
        System.out.println("averageSalary :"+averageSalary);

        double empSum = Databse.getEmp().stream()
                .filter(e -> e.getGrade().equalsIgnoreCase("A"))
                .map(e -> e.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println("Employee sum :"+empSum);

        int maxSalary = Databse.getEmp().stream()
                .filter(e -> e.getGrade().equalsIgnoreCase("A"))
                .map(e -> e.getSalary())
                .reduce(Integer::max).get();
        System.out.println("Max Salary :"+maxSalary);

        List<Integer> a = Databse.getEmp().stream()
                .filter(e -> e.getGrade().equalsIgnoreCase("A"))
                .map(e -> e.getSalary()).sorted((o1, o2) -> o1>o2?o1:o2).limit(1)
                .collect(Collectors.toList());
        System.out.println(a);


    }
}
