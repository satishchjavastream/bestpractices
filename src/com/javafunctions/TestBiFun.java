package com.javafunctions;

import java.util.function.BiFunction;

public class TestBiFun {

    public static void main(String[] args) {

        EmployeeBiFun emp = new EmployeeBiFun(101,"Satish",1000);
        TimeSheetBiFun times = new TimeSheetBiFun(101,30);

        BiFunction<EmployeeBiFun,TimeSheetBiFun,Double> bifun = (e,t)->e.dailyWage * t.days;

        System.out.println("Monthly wage of the employee :"+bifun.apply(emp,times));
    }
}
