package com.javastreams;

import java.util.*;
import java.util.stream.Collectors;

public class TestEmployeeStream {
    public static void main(String[] args) {
        List<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(new Employee("Sam","Engineering",10000));
        listOfEmployees.add(new Employee("Ramesh","Engineering",15000));
        listOfEmployees.add(new Employee("Rajesh","Marketing",20000));
        listOfEmployees.add(new Employee("Pooja","HR",25000));
        listOfEmployees.add(new Employee("Jhon","HR",30000));
        listOfEmployees.add(new Employee("Satish","Engineering",35000));

        //Get the employee based on the department. - groupingBy();
        Map<String, List<Employee>> byDepartment = listOfEmployees.stream().collect(Collectors.groupingBy(e->e.getDepartment()));
        System.out.println("Employees based on department :"+byDepartment);

        //Highest paid employees from each department.
        Map<String,Employee> highestPaidDepWiseEmployee = listOfEmployees.stream().collect(
                Collectors.groupingBy( e->e.getDepartment(),
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(e->e.getSalary())), Optional::get)));
        System.out.println("Highest paid employees for each employee :"+highestPaidDepWiseEmployee);

    }
}
