package com.company;


import java.util.Observable;
import java.util.Observer;

public class PaniKolejkowa implements Observer {
    private String imie;
    private String nazwisko;

    public PaniKolejkowa(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return this.imie + " " + this.nazwisko;
    }

    void kupujIleSięDa(Sklep s,String towar) {
        System.out.println("Pani " + this + " wykupuje towar z " + s + ". Siaty pełne.");
    }

    public void update(Observable s, Object o) {
        kupujIleSięDa((Sklep) s,(String) o);
    }

}