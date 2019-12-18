package com.company;

import java.util.Observable;

public class Sklep extends Observable {
    private String nazwa;
    public String getNazwa(){
        return this.nazwa;
    }
    public Sklep(String nazwa){
        this.nazwa=nazwa;
    }

    @Override
    public String toString() {
        return this.nazwa;
    }
    public void rzuciliTowar(String towar){
        setChanged();
        System.out.println("Rzucono " + towar + " do sklepu " + this.nazwa + "! Tłumy szaleją");
        notifyObservers(towar);
    }

}
