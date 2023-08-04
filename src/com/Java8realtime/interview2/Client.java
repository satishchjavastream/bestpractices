package com.Java8realtime.interview2;

import java.util.*;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {



    }


    public static List<Employee> getEmployees(){

        Department account = new Department("Account", 75);
        Department hr = new Department("HR", 50);
        Department ops = new Department("OP", 25);
        Department tech = new Department("Tech", 150);

        List<Employee> employeeList = Arrays.asList(new  Employee("David", 32, "Matara", account),
                new  Employee("Brayan", 25, "Galle", hr),
                new  Employee("JoAnne", 45, "Negombo", ops),
                new  Employee("Jake", 65, "Galle", hr),
                new  Employee("Brent", 55, "Matara", hr),
                new  Employee("Allice", 23, "Matara", ops),
                new  Employee("Austin", 30, "Negombo", tech),
                new  Employee("Gerry", 29, "Matara", tech),
                new  Employee("Scote", 20, "Negombo", ops),
                new  Employee("Branden", 32, "Matara", account),
                new  Employee("Iflias", 31, "Galle", hr));

        return employeeList;
    }
}
