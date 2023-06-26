package com.javafunctions;

public class TestConsRefer {
    public static void main(String[] args) {

       /* InterSample is = () -> {
            Sample s = new Sample();
            return  s;
        };
        is.get();*/

        InterSample is = Sample::new;
        Sample s=is.get();
    }
}
