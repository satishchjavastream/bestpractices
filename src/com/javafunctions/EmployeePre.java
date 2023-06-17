package com.javafunctions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeePre {
    String name;
    String designation;
    double salary;
    String city;

    public EmployeePre(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return "\n["+name+"  -  "+designation+"  -  "+salary+"  -  "+city+"]";
    }

    @Override
    public boolean equals(Object obj) {
        EmployeePre e = (EmployeePre) obj;
        if(name.equals(e.name) && designation.equals(e.designation) && salary==e.salary && city == e.city){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayList<EmployeePre> employees = new ArrayList<>();
        employees.add(new EmployeePre("Ramesh","Manager",10000,"Texas"));
        employees.add(new EmployeePre("Sandeep","Tester",6000,"New Jersey"));
        employees.add(new EmployeePre("Jhon","Manager",8000,"New York"));
        employees.add(new EmployeePre("Satish","Manager",10000,"Texas"));
        employees.add(new EmployeePre("Kiran","Tester",9000,"Chicago"));
        employees.add(new EmployeePre("Ravi","Developer",10000,"California"));
        employees.add(new EmployeePre("Khan","Developer",5000,"Texas"));
        employees.add(new EmployeePre("Babu","Developer",4000,"Texas"));
        employees.add(new EmployeePre("Alex","Developer",4500,"Texas"));

        System.out.println("Populate all the employee details :");
        populateEmployeDetails(employees);

        System.out.print("Display manager info: ");
        Predicate<EmployeePre> p1= emp->emp.designation.equals("Manager");
        displayResults(p1,employees);


        System.out.print("\nDisplay the Texas employees ");
        Predicate<EmployeePre> p2 = emp->emp.city.equals("Texas");
        displayResults(p2,employees);

        System.out.print("\nDisplay the employee, who's salary less than 5000");
        Predicate<EmployeePre> p3 = emp->emp.salary < 5000;
        displayResults(p3,employees);

        System.out.print("\nPrint Texas manager information :");
        displayResults(p1.and(p2),employees);

        System.out.print("\nPrint developers who's not from texas.");
        Predicate<EmployeePre> p4 = emp->emp.designation.equals("Developer");
        displayResults(p2.negate().and(p4),employees);

        System.out.print("\nPrint Manager or salary less than 5000 employees list");
        displayResults(p1.or(p3),employees);

        EmployeePre e1 = new EmployeePre("Alex","Developer",4500,"MD");
        EmployeePre e2 = new EmployeePre("Sam","Developer",6000,"Texas");
        Predicate<EmployeePre> p5 = Predicate.isEqual(e1);
        System.out.println("isEqual :"+p5.test(e2));
    }

    private static void displayResults(Predicate<EmployeePre> p1, ArrayList<EmployeePre> employees) {
        for(EmployeePre e:employees){
            if(p1.test(e)){
                System.out.print(e);
            }
        }
    }


    private static void populateEmployeDetails(ArrayList<EmployeePre> employees) {

        System.out.println(employees);
    }


}
