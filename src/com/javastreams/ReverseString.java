package com.javastreams;

import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        // Reversing a string

        String myString = "Hello, How are you ? What are you doing ?";
        System.out.println("String :"+myString);

        //Using stringBuilder
        String reverseMyString = new StringBuilder(myString).reverse().toString();
        System.out.println("Reversed String :"+reverseMyString);

        //Using charAt()
        for (int i=myString.length()-1;i>=0;i--){
            System.out.print(myString.charAt(i));
        }

        //Using java 8 to reverse string
        String reverseStringJava8 = myString.chars().mapToObj(c-> String.valueOf((char)c))
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return String.join("", list);
                }));
        System.out.println("\n");
        System.out.println("Reversed String Java 8 : "+reverseStringJava8);
    }
}
