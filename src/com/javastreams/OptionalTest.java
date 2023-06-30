package com.javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(101,"jhon","abcdef", Arrays.asList("3445239098","3452390898"));

        //empty
        //of
        //ofNullable

        //empty
        Optional<Object> emptyOptional = Optional.empty();
        //System.out.println("emptyOptional :"+emptyOptional);

        //of
        //Optional<String> email = Optional.of(customer.getEmail());
       // System.out.println("email :"+email);

        //ofNullable
        Optional<Object> o = Optional.ofNullable(customer.getEmail());
       // System.out.println("email ofNullable :"+o);
       // System.out.println("email nullable :"+o.get());

       /* if(o.isPresent()){
            System.out.println(o.get());
        }*/

        //System.out.println(o.orElse("abc@gmail.com"));
       // o.orElseGet(()-> System.out.println("wewe@gmail.com");

        //System.out.println(o.orElseThrow(()->new IllegalArgumentException("email exception..!")));

        System.out.println(o.map(s->s.toString().toUpperCase()).orElseGet(()->"default message"));

        List<Customer> all = Databse.getAll();

        /*String email = "satish@gmail.com";
        all.stream()
                .filter(c->c.getEmail().equals(email))
                .findAny().orElseThrow(()->new Exception("Exception "));*/


    }
}
