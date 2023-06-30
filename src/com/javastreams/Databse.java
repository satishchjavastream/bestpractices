package com.javastreams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Databse {

    public static List<Customer> getAll(){

        return Stream.of(
                new Customer(101,"Satish","satish@gmail.com", Arrays.asList("1234567890","9898988787")),
                new Customer(101,"Ramesh","ramesh@gmail.com", Arrays.asList("9874993845","9233910182")),
                new Customer(102,"Rajesh","rajesh@gmail.com", Arrays.asList("2937181192","9181729123")),
                new Customer(103,"Jhon","jhon@gmail.com", Arrays.asList("8711283711","3817193181")),
                new Customer(104,"Smith","smith@gmail.com", Arrays.asList("2191381112","91381921031")))
                .collect(Collectors.toList());
    }

    public static List<Employee> getEmployess(){

        return Stream.of(
                new Employee("Sam","Engineering",10000),
                new Employee("Ramesh","Engineering",15000),
                new Employee("Rajesh","Marketing",20000),
                new Employee("Pooja","HR",25000),
                new Employee("Jhon","HR",30000),
                new Employee("Satish","Engineering",35000))
                .collect(Collectors.toList());
    }

    public static Map<Employee,Integer> getEmpMapDetails(){
       Map<Employee,Integer> map = new HashMap<>();
        map.put(new Employee("Sam","Engineering",10000),30);
        map.put(new Employee("Ramesh","Engineering",15000),20);
        map.put(new Employee("Rajesh","Marketing",20000),10);
        map.put(new Employee("Pooja","HR",25000),5);
        map.put(new Employee("Jhon","HR",30000),100);
        map.put(new Employee("Satish","Engineering",35000),50);
        return  map;
    }

    public static List<EmployeeGrad> getEmp(){

        return Stream.of(
                        new EmployeeGrad(101,"Sam","C",10000),
                        new EmployeeGrad(102,"Ramesh","B",15000),
                        new EmployeeGrad(103,"Rajesh","B",20000),
                        new EmployeeGrad(104,"Pooja","A",25000),
                        new EmployeeGrad(105,"Jhon","A",30000),
                        new EmployeeGrad(106,"Satish","A",35000))
                .collect(Collectors.toList());
    }

}
