package com.javalamdba;

import java.util.ArrayList;
import java.util.Collections;

public class SortingEmpTest {
    public static void main(String[] args) {

        ArrayList<Employee> l = new ArrayList<Employee>();
        l.add(new Employee(200, "Satish"));
        l.add(new Employee(100, "Harish"));
        l.add(new Employee(600, "Ramesh"));
        l.add(new Employee(900, "Rajesh"));
        l.add(new Employee(400, "Suresh"));

        System.out.println("Before sorting :" + l);
        Collections.sort(l, (e1, e2) -> (e1.empNo < e2.empNo) ? -1 : (e1.empNo > e2.empNo) ? 1 : 0);

        System.out.println("After sorting - ASC :" + l);

        Collections.sort(l, (e1, e2) -> (e1.empNo > e2.empNo) ? -1 : (e1.empNo < e2.empNo) ? 1 : 0);

        System.out.println("After sorting - DESC :" + l);
    }
}
