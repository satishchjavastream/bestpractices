package com.javastreams;

import java.util.*;
import java.util.stream.Collectors;

public class TestJava8BestPrograms {
    public static void main(String[] args) {

        // Find any value from the in a string.
        List<String> list = Arrays.asList("a","b");
        System.out.println(list.stream().findAny().orElseGet(()->"Hello i am satish"));

        // ForEach(Consumer) and filter(Predicate) method use
        List<String> names = Arrays.asList("Satish","Sivaram","Suresh","Raja","Santhosh");
        //names.forEach((t)-> System.out.println(t));
        //names.stream().forEach((t)-> System.out.println(t));
        //names.stream().forEach(System.out::println);
        //names.forEach(System.out::println);
       // names.stream().filter(s->s.startsWith("S")).forEach(System.out::println);


        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");
        //map.forEach((key,value)-> System.out.println(key+" : "+ value));
        //map.entrySet().stream().forEach(t-> System.out.println(t));
        //map.entrySet().stream().forEach(System.out::println);
        //map.entrySet().stream().filter(m->m.getKey()%2==0).forEach(m-> System.out.println(m));

        // Print the numbers in the asc and desc
        List<Integer> nums = Arrays.asList(100,14,3,40,30,23,102,98,48);
        //nums.stream().sorted().forEach(l-> System.out.println(l));
        //nums.stream().sorted(Comparator.reverseOrder()).forEach(l-> System.out.println(l));

        // Sort the employee salary
        List<Employee> employees = Databse.getEmployess();
        //employees.stream().sorted((e1,e2)->e2.getSalary()-e1.getSalary()).forEach(e-> System.out.println(e));
        //employees.stream().sorted(Comparator.comparing(e->e.getName())).forEach(e-> System.out.println(e));

        Map<String,Integer> namemap = new HashMap<>();
        namemap.put("Ramesh",100);
        namemap.put("AbhiRam",20);
        namemap.put("Rajesh",10);
        namemap.put("Sam",5);
        namemap.put("Balaji",60);
        namemap.put("Jhon",70);

        //System.out.println(namemap);
        //namemap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        //namemap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(m-> System.out.println(m));

        Map<Employee,Integer> empMap = Databse.getEmpMapDetails();
        //empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
        //empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed())).forEach(System.out::println);
    }
}
