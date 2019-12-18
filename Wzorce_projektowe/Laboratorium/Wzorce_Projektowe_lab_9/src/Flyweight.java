import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Flyweight {
    public static void main(String[] args) throws FileNotFoundException {
        BlokTekstu bt;
   /*     System.out.println("Proszę podać napis. ");
        Scanner odczyt = new Scanner(System.in);
            String text = odczyt.nextLine();
            odczyt.close();
        bt = new BlokTekstu(text);
        bt.wypiszDuze();
        System.out.println("");
        bt.wypiszMale();
        System.out.println("");
        bt.wypisz();
        System.out.println("");
*/
        System.out.println("Proszę podać nazwę pliku: ");

        Scanner odczyt1 = new Scanner(System.in);
        String text1 = odczyt1.nextLine();
        File f = new File(text1);
        bt = new BlokTekstu(f);
        odczyt1.close();
        bt.wypiszDuze();
        System.out.println("");
        bt.wypiszMale();
        System.out.println("");
        bt.wypisz();


    }
}
