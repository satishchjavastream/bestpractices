package com.javafunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class StudentCos {
    String name;
    int marks;

    public StudentCos(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
        List<StudentCos> students = new ArrayList<>();
        populateStudents(students);

        Predicate<StudentCos> p = s->s.marks>=60;
        Function<StudentCos,String> f = s-> {
            int marks = s.marks;
            if(marks>=80){
                return "A[Distinction]";
            } else if (marks>=60) {
                return "B[First Class]";
            } else if (marks>=50) {
                return "C[Second Class]";
            } else if (marks>=35){
                return "D[Third Class]";
            }else{
                return "E[Fail]";
            }
        };
        Consumer<StudentCos> c = s->{
            System.out.println("\nStudent Name:"+s.name);
            System.out.println("Student Marks:"+s.marks);
            System.out.println("Student Grade:"+f.apply(s));
        };

        for (StudentCos s:students){
            if (p.test(s)){
                c.accept(s);
            }
        }

    }

    private static void populateStudents(List<StudentCos> students) {
        students.add(new StudentCos("Satish",90));
        students.add(new StudentCos("Srinu",80));
        students.add(new StudentCos("Ramesh",70));
        students.add(new StudentCos("Jhon",60));
        students.add(new StudentCos("Amar",50));
        students.add(new StudentCos("Khan",60));
        students.add(new StudentCos("Syadh",70));
        students.add(new StudentCos("Alex",90));
        students.add(new StudentCos("Smith",30));
        students.add(new StudentCos("Salman",20));
    }
}
