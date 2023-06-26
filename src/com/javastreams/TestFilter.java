package com.javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Satish");
        l.add("RameshKumar");
        l.add("sam");
        l.add("Ramachandra");
        l.add("KumarSwami");
        System.out.println("Array List: "+l);

        // Filter and collect(Collectors.toList());
        List<String> l1= l.stream().filter(s->s.length()>=9).collect(Collectors.toList());
        System.out.println("Filtered output :"+l1);

        // Map and collect(Collectors.toList())
        List<String> l2 = l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println("Upper case names: "+l2);

        long count = l.stream().filter(s->s.length()>=9).count();
        System.out.println("count of the names which is >=9 : "+count);
    }
}
