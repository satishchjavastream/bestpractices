package com.javafunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentFun {
    String name;
    int marks;

    public StudentFun(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "\n[" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ']';
    }

    public static void main(String[] args) {
        List<StudentFun> students = new ArrayList<>();
        students.add(new StudentFun("Satish",90));
        students.add(new StudentFun("Srinu",80));
        students.add(new StudentFun("Ramesh",70));
        students.add(new StudentFun("Jhon",60));
        students.add(new StudentFun("Amar",50));
        students.add(new StudentFun("Khan",60));
        students.add(new StudentFun("Syadh",70));
        students.add(new StudentFun("Alex",90));
        students.add(new StudentFun("Smith",30));
        students.add(new StudentFun("Salman",20));

        populateStudentDetials(students);

        Function<StudentFun,String> student = s->{
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

        //If students marks >=60 then, show me those student grade.
        Predicate<StudentFun> p = s->s.marks>=60;

        for (StudentFun s:students){
            if(p.test(s)){
                System.out.println("Name :"+s.name);
                System.out.println("Marks :"+s.marks);
                System.out.println("Grade :"+student.apply(s));
            }
        }

    }

    private static void populateStudentDetials(List<StudentFun> students) {
        System.out.println(students);
    }


}
