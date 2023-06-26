package com.javafunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class EmployeeBiFunBiCons {
    String name;
    double salary;

    public EmployeeBiFunBiCons(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<EmployeeBiFunBiCons> empList = new ArrayList<>();

        BiFunction<String,Double,EmployeeBiFunBiCons> bifun = (name,salary)->new EmployeeBiFunBiCons(name,salary);
        System.out.println(empList.add(bifun.apply("Satish",4000.0)));
        System.out.println(empList.add(bifun.apply("Ramesh",5000.0)));
        System.out.println(empList.add(bifun.apply("Ramkumar",6000.0)));

        for (EmployeeBiFunBiCons e:empList){
            System.out.println("Name :"+e.name);
            System.out.println("Salary :"+e.salary);

        }
        System.out.println("=======================");
        BiConsumer<EmployeeBiFunBiCons,Double> c = (emp,inc)-> emp.salary = emp.salary+inc;
        for(EmployeeBiFunBiCons e:empList){
            c.accept(e,100.0);
        }
        for (EmployeeBiFunBiCons e:empList){
            System.out.println("Name :"+e.name);
            System.out.println("Salary :"+e.salary);

        }


    }
}
