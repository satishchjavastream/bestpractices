package com.javastreams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestJava8BestPrograms {
    public static void main(String[] args) {

        // Find any value from the in a string.
        List<String> list = Arrays.asList("a","b");
       // System.out.println(list.stream().findAny().orElseGet(()->"Hello i am satish"));

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

        // Write a program to find the sum of all numbers in a list using Java 8 streams.
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,8,9,10);
        int sum = numbers.stream().mapToInt(i -> i).sum();
        int sum1 = numbers.stream().reduce((a,b)->a+b).get();
        int sum2 = numbers.stream().reduce(Integer::sum).get();
        //System.out.println("sun of intergers :"+sum+ " : "+sum1+" : "+sum2);

        //Write a program to remove duplicates from an ArrayList using Java 8 streams.
        List<Integer> elements = Arrays.asList(1,4,6,4,6,3,7,8,9,10,202,3,4);
        List<Integer> distinctElements = elements.stream().distinct().collect(Collectors.toList());
        //System.out.println("distinctElements :"+distinctElements);

        //Write a program to count the number of occurrences of each element in an ArrayList using Java 8 streams.
        elements = Arrays.asList(1,4,6,4,6,3,7,8,9,10,202,3,4);
        Map<Integer,Long> noOfOcc = elements.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //System.out.println("number of occurrences of each element :"+noOfOcc);

        //list of String objects by their lengths and count the number of strings with each length:
        List<String> listOfStrings = Arrays.asList("satish","sivaram","satish","ramesh","rajesh","ramkumar");
        Map<String,Long> stringwithCount = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //System.out.println("stringwithCount :"+stringwithCount);
        Map<Integer,Long> lengthOfCount = listOfStrings.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
        //System.out.println("lengthOfCount :"+lengthOfCount);

        // list of Person objects and you want to group them by their age
        Map<Integer , List<Person>> personBasedonAge =  Databse.getPerson().stream().collect(Collectors.groupingBy(Person::getAge));
        //System.out.println("person based on the age :"+personBasedonAge);

       /*List<Order> orders = ... // List of Order objects
       Map<Customer, Double> totalAmountByCustomer = orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomer, Collectors.summingDouble(Order::getAmount))); */

        //list of Employee objects by their department and age greater than 30:
        Map<String, List<Employee>> empdepwithsalgt4k = Databse.getEmployess().stream().collect(Collectors.groupingBy(e -> e.getDepartment() + " - " + (e.getSalary() > 15000 ? "Above 15000" : "Below 15000")));
        //System.out.println("empdepwithsalgt4k :"+empdepwithsalgt4k);

        //Emp Highest salary
        Map<String, Employee> collect = Databse.getEmployess().stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(),
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e -> e.getSalary())),
                                Optional::get)));
        //System.out.println(collect);

        //Write a program to find the maximum element in an ArrayList using Java 8 streams.
        nums = Arrays.asList(100,14,3,40,30,23,102,98,48);
        int maxNum = nums.stream().reduce(Integer::max).get();
        //System.out.println("Max number :"+maxNum);

        //Write a program to convert a list of strings to uppercase using Java 8 streams.
        names = Arrays.asList("Satish","Sivaram","Suresh","Raja","Santhosh");
        names.stream().map(s->s.toUpperCase()).forEach(System.out::println);

        //Write a program to filter even numbers from a list using Java 8 streams.
        nums = Arrays.asList(100,14,3,40,30,23,102,98,48);
        List<String> evenNums = nums.stream().filter(i->i%2==0).map(i->String.valueOf(i)).collect(Collectors.toList());
        //System.out.println("Even numbers :"+evenNums);

        //Write a program to find the average of all numbers in a list using Java 8 streams.
        nums = Arrays.asList(100,14,3,40,30,23,102,98,48);
        Double avg = nums.stream().mapToDouble(Integer::doubleValue).average().orElseGet(()->0.0);
        //System.out.println("Average value :"+avg);

        double avg2 = nums.stream().reduce(0, Integer::sum).doubleValue() / nums.size();
        //System.out.println("average :"+avg2);

        //Write a program to check if a list contains a specific element using Java 8 streams.
        nums = Arrays.asList(100,14,3,40,30,23,102,98,48);
        boolean findNum = nums.stream().anyMatch(n->n==3);
        //System.out.println("find num :"+findNum);

        //Write a program to sort a list of strings in alphabetical order using Java 8 streams.
        List<String> listOfStr = Arrays.asList("satish","sivaram","satish","ramesh","rajesh","ramkumar","AbhiRam","Dinesh");
        List<String> sortedStr = listOfStr.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted string :"+sortedStr);

        //Write a program to find the second smallest and highest number in an array using Java 8 streams.
        nums = Arrays.asList(100,14,3,40,30,23,102,98,48);
        List<Integer> smallest = nums.stream().sorted().limit(2).skip(1).collect(Collectors.toList());
        System.out.println(smallest);

        Integer[] arryNumber = {1,2,3,4,5,6,7,2,3,4,5};
        Optional<Integer> small = Arrays.stream(arryNumber).distinct().skip(1).findFirst();
        System.out.println("small value from array :"+small.get());
        Optional<Integer> highest = Arrays.stream(arryNumber).sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("highest value from array :"+highest.get());
        //Write a program to find the third largest element in an array using Java 8 streams.
        Optional<Integer> third = Arrays.stream(arryNumber).distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst();
        System.out.println("third highest :"+third.get());

        //Write a program to check if a string is a palindrome using Java 8 streams.
        String str = "level";
        String reverse = new StringBuffer(str).reverse().toString();
        boolean isPalindrome = IntStream.range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == reverse.charAt(i));
        System.out.println("Is palindrome: " + isPalindrome);

        //Write a program to find the factorial of a number using Java 8 streams.
        int number = 5;
        int factorial = IntStream.rangeClosed(1,number).reduce(1,(a,b)->a*b);
        System.out.println("factorial :"+factorial);

        //Write a program to check if a number is prime using Java 8 streams.
        int numb = 7;
        boolean isPrime = IntStream.rangeClosed(2, (int) Math.sqrt(numb)).noneMatch(n -> numb % n == 0);
        System.out.println("isPrime :"+isPrime);


    }
}
