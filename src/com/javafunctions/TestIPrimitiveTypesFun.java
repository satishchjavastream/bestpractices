package com.javafunctions;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class TestIPrimitiveTypesFun {
    public static void main(String[] args) {

        // IntPredicate example.  / IntPredicate , LongPredicate and DoublePredicate
        int x[]={5,10,15,20,25};

        IntPredicate p = i->i%2==0;
        for (int x1:x){
           if (p.test(x1)) {
                System.out.println(x1+" : Even numbers");
            }
        }

        //IntFunction<Integer> example,  input : Integer , Output : Integer
        IntFunction<Integer> f = i->i*i;
        System.out.println("Square root of the value :"+f.apply(10));

        //ToIntFunction<String> example, input : String , Output : int
        ToIntFunction<String> tf= s->s.length();
        System.out.println(tf.applyAsInt("satish"));

        IntToDoubleFunction idf= i->Math.sqrt(i);
        System.out.println("Square root of the value :"+idf.applyAsDouble(5));

    }
}
