package com.javafunctions;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class StudentBiFun {
    String name;
    int rollNumber;

    public StudentBiFun(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public static void main(String[] args) {
        ArrayList<StudentBiFun> al = new ArrayList<>();

        BiFunction<String,Integer,StudentBiFun> bifun = (name,rollNumber)->new StudentBiFun(name,rollNumber);
        al.add(bifun.apply("Satish",100));
        al.add(bifun.apply("Ram",200));

        for(StudentBiFun s: al){
            System.out.println("Student Name :"+s.name);
            System.out.println("Student Roll Number :"+s.rollNumber);
        }

    }
}
