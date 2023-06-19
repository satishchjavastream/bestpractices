package com.javafunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MovieCons {
    String name;
    String hero;
    String heroin;

    public MovieCons(String name, String hero, String heroin) {
        this.name = name;
        this.hero = hero;
        this.heroin = heroin;
    }
/*
    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ", hero='" + hero + '\'' +
                ", heroin='" + heroin + '\'' +
                ']';
    }*/

    public static void main(String[] args) {
        List<MovieCons> movies = new ArrayList<>();
        movies.add(new MovieCons("RRR","Ramcharan","Aliya"));
        movies.add(new MovieCons("Titanic","Ramcharan","Aliya"));
        movies.add(new MovieCons("Bahubali","Prabash","Anuska"));
        movies.add(new MovieCons("KGF","Ramcharan","Aliya"));
        movies.add(new MovieCons("Julayi","AlluArjun","Iliyana"));
        movies.add(new MovieCons("Idiot","Raviteja","Aliya"));
        movies.add(new MovieCons("Pokiri","MaheshBabu","Iliyana"));
        movies.add(new MovieCons("Chiminal","Nagarjuna","Aliya"));

        Consumer<MovieCons> c = m-> {
            System.out.println("\nMovie Name :"+m.name);
            System.out.println("Movie Hero :"+m.hero);
            System.out.println("Movie Heroin :"+m.heroin);
        };

        for (MovieCons m:movies){
            c.accept(m);
        }

    }
}
