package com.javafunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.ObjDoubleConsumer;

public class EmployeeObjDoubleCons {
    String name;
    double salary;

    public EmployeeObjDoubleCons(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<EmployeeObjDoubleCons> empList = new ArrayList<>();

        BiFunction<String,Double, EmployeeObjDoubleCons> bifun = (name, salary)->new EmployeeObjDoubleCons(name,salary);
        System.out.println(empList.add(bifun.apply("Satish",4000.0)));
        System.out.println(empList.add(bifun.apply("Ramesh",5000.0)));
        System.out.println(empList.add(bifun.apply("Ramkumar",6000.0)));

        for (EmployeeObjDoubleCons e:empList){
            System.out.println("Name :"+e.name);
            System.out.println("Salary :"+e.salary);

        }
        System.out.println("=======================");
        ObjDoubleConsumer<EmployeeObjDoubleCons> c = (emp, inc)-> emp.salary = emp.salary+inc;
        for(EmployeeObjDoubleCons e:empList){
            c.accept(e,100.0);
        }
        for (EmployeeObjDoubleCons e:empList){
            System.out.println("Name :"+e.name);
            System.out.println("Salary :"+e.salary);

        }


    }
}
