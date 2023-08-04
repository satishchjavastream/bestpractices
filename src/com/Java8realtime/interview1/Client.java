package com.Java8realtime.interview;

import java.util.*;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        //1) How many male and female employees are there in the organization?
        Map<String,Long> maleFemaleEmpCount = getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("maleFemaleEmpCount :"+maleFemaleEmpCount);

        //2) Print the name of all departments in the organization?
        getEmployees().stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        //3) What is the average age of male and female employees?
        Map<String,Double> avgAgeOfMaleFemale = getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
        System.out.println("avgAgeOfMaleFemale :"+avgAgeOfMaleFemale);

        //4) Get the details of highest paid employee in the organization?
        Optional<Employee> highestPaidEmp = getEmployees()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println("highestPaidEmp :"+highestPaidEmp);

        //Get the names of all employees who have joined after 2015?
        List<String> joinedAfter2015 = getEmployees()
                .stream()
                .filter(e->e.getYearOfJoining() >2015)
                .map(Employee::getName).collect(Collectors.toList());
        System.out.println("Employees joined after 2015"+joinedAfter2015);

        //Count the number of employees in each department?
        Map<String,Long> countEmpDept = getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println("countEmpDept :"+countEmpDept);

        //What is the average salary of each department?
        Map<String,Double> avgSalOfEachDept = getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("avgSalOfEachDept :"+avgSalOfEachDept);

        //Get the details of youngest male employee in the product development department?
        Optional<Employee> youngestMale = getEmployees()
                .stream()
                .filter(e->e.getDepartment().equalsIgnoreCase("Product Development") && e.getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)));
        System.out.println("youngestMale :"+youngestMale);

        //Who has the most working experience in the organization?
        Optional<Employee> mostExpEmp = getEmployees()
                .stream()
                .sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        System.out.println("mostExpEmp :"+mostExpEmp);

        //How many male and female employees are there in the sales and marketing team?
        Map<String,Long> maleFemaleEmpList = getEmployees()
                .stream()
                .filter(e->e.getDepartment().equalsIgnoreCase("Sales And Marketing"))
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("maleFemaleEmpList in Sales And Marketing:"+maleFemaleEmpList);

        //What is the average salary of male and female employees?
        Map<String,Double> avgSalOfMaleFemale = getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("avgSalOfMaleFemale :"+avgSalOfMaleFemale);

        //List down the names of all employees in each department?
        Map<String,List<Employee>> listOfEmpNamesfromEachDept = getEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("listOfEmpNamesfromEachDept :"+listOfEmpNamesfromEachDept);

        Set<Map.Entry<String,List<Employee>>> set = listOfEmpNamesfromEachDept.entrySet();
        for (Map.Entry<String,List<Employee>> entry: set){
            System.out.println("Employees In "+entry.getKey() + " : ");
           List<Employee> list = entry.getValue();
           for (Employee e:list){
               System.out.println("e.getName :"+e.getName());
           }

        }


        //What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics summary = getEmployees()
                .stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println(summary.getSum());
        System.out.println(summary.getAverage());

        //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean, List<Employee>> partitionEmployeeByAge = getEmployees()
                .stream()
                .collect(Collectors.partitioningBy(e->e.getAge()>25));
        System.out.println(partitionEmployeeByAge);

        //Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Employee> oldestemployee = getEmployees()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)));
        System.out.println(oldestemployee);

        
    }


    public static List<Employee> getEmployees(){

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        return employeeList;
    }
}
