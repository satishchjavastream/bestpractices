package com.javastreams;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {

        List<Customer> customerList = CustomerDatabse.getAll();
        System.out.println("Get all the customers :"+customerList);

        // Map is used Data transformation , OneToOne mapping , for-loop-data  List<Stream> -> List<Stream>
        List<String> emails= customerList.stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println("Customer email ids :"+emails);

        List<List<String>> phoneNumbers = customerList.stream()
                .map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println("Customer Phone numbers :"+phoneNumbers);

        // flatMap is used Data transformation + flattering , OnetoMany , Nested for-loop List<Stream> -> List<Stream>
        List<String> phones = customerList.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println("Customer phone numbers after flattering :"+phones);




    }
}
