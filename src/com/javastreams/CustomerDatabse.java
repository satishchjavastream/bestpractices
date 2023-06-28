package com.javastreams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabse {

    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101,"Satish","satish@gmail.com", Arrays.asList("1234567890","9898988787")),
                new Customer(101,"Ramesh","ramesh@gmail.com", Arrays.asList("9874993845","9233910182")),
                new Customer(102,"Rajesh","rajesh@gmail.com", Arrays.asList("2937181192","9181729123")),
                new Customer(103,"Jhon","jhon@gmail.com", Arrays.asList("8711283711","3817193181")),
                new Customer(104,"Smith","smith@gmail.com", Arrays.asList("2191381112","91381921031")))
                .collect(Collectors.toList());

    }


}
