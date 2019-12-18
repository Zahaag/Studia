package com.company;

import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        Sklep s1 = new Sklep("Biedronka");
        Sklep s2 = new Sklep("Lidl");
        Sklep s3 = new Sklep("Tesko");

        PaniKolejkowa p1= new PaniKolejkowa("Ewa","Biedroń");
        PaniKolejkowa p2= new PaniKolejkowa("Karol","Lidl");
        PaniKolejkowa p3= new PaniKolejkowa("Ula","Tesko");

        s1.addObserver(p1);
        s2.addObserver(p2);
        s3.addObserver(p3);
        s1.rzuciliTowar("Makaron");
        s2.rzuciliTowar("Kawa");
        s3.rzuciliTowar("Herbata");

    }

}
