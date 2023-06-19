package com.javafunctions;

import com.javalamdba.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeFun {
    String name;
    double salary;

    public EmployeeFun(String name, double salary) {
        this.name = name;
       this.salary = salary;
    }

    @Override
    public String toString() {
        return name+":"+salary;
    }

    public static void main(String[] args) {

        List<EmployeeFun> employees = new ArrayList<>();
        employees.add(new EmployeeFun("Satish",14000));
        employees.add(new EmployeeFun("Ram",10000));
        employees.add(new EmployeeFun("Sam",20000));
        employees.add(new EmployeeFun("Alex",2000));
        employees.add(new EmployeeFun("Jhon",12000));
        employees.add(new EmployeeFun("Khan",13000));
        employees.add(new EmployeeFun("Sayed",11000));
        employees.add(new EmployeeFun("Garge",10000));
        employees.add(new EmployeeFun("Swaroop",12000));
        employees.add(new EmployeeFun("Santhosh",11000));

        getAllEmployeeDetails(employees);

        //Find total monthly salary of all the employees
        Function<List<EmployeeFun>,Double> f =list->{
            double total = 0;
            for (EmployeeFun e:list){
                total = total + e.salary;
            }
           // System.out.println("Total salary :"+total);
            return total;
        };
        System.out.println("Total salary of all employees :"+f.apply(employees));

        // increment salary of 477 to employs, who has less than 3500.
        System.out.println("Before increment salary :");
        System.out.println("Salary of all the employees :"+employees);
        System.out.println("After increment salary :");

        Predicate<EmployeeFun> p=emp->emp.salary<3500;

        Function<EmployeeFun,EmployeeFun> empFun = employeeFun ->{
                employeeFun.salary = employeeFun.salary+477;
                return employeeFun;
        };

        List<EmployeeFun> employeesList = new ArrayList<>();
        for (EmployeeFun e : employees){
            if(p.test(e)){
                empFun.apply(e);
                employeesList.add(e);
            }
        }
        System.out.println("Salary of all the employees, after increment :"+employees);
    }

    private static void getAllEmployeeDetails(List<EmployeeFun> employees) {
        System.out.println(employees);
    }
}
