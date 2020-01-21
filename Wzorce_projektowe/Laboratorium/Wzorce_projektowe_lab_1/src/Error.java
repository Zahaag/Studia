/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Error {
    
public static void main(String[] args) {
ArrayList<Figura> listaFigur = new ArrayList<Figura>();
listaFigur.add(new Prostokat(1,2));
listaFigur.add(new Kwadrat(3));
listaFigur.add(new Kolo(2.5));
listaFigur.add(new Trojkat(1,2,3,4));
System.out.println("OBWODY:");
for(Figura i: listaFigur) {
System.out.println(i.getObwod());
}
System.out.println("POLA:");
for(Figura i: listaFigur) {
System.out.println(i.getPole());
}
}
