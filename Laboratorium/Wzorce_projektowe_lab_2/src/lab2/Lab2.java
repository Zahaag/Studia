
package lab2;

public class Lab2 {

 public static void main(String[] args) {
Sklep sk = Sklep.getInstance();
sk.nazwa = "sk";
Sklep t = Sklep.getInstance();
System.out.println("1 instancja: " + sk);
System.out.println("2 instancja: " + t);
 sk.kupuj();
sk.zamknij();
sk.kupuj();
sk.remanentuj();
sk.kupuj();
sk.otwórz();
sk.kupuj();
    }
    
}
