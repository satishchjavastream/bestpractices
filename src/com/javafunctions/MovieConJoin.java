package com.javafunctions;

import java.util.function.Consumer;

public class MovieConJoin {
    String name;
    String result;

    public MovieConJoin(String name, String result) {
        this.name = name;
        this.result = result;
    }

    public static void main(String[] args) {

        Consumer<MovieConJoin> c1=m-> System.out.println("Movie name :"+m.name+"Ready to release");
        Consumer<MovieConJoin> c2=m-> System.out.println("Movie name :"+m.name+" movie review :"+m.result);
        Consumer<MovieConJoin> c3=m-> System.out.println("Movie name :"+m.name+" stored into database.");

        Consumer<MovieConJoin> chainedC = c1.andThen(c2).andThen(c3);

        MovieConJoin m = new MovieConJoin("Bhabubali","hit");
        chainedC.accept(m);
    }
}
