package com.javalamdba;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
    int empNo;
    String eName;

    Employee(int empNo,String eName){
        this.empNo = empNo;
        this.eName = eName;
    }

    @Override
    public String toString() {
        return empNo+" : "+eName;
    }
}

