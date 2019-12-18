import java.util.Scanner;
import java.util.Stack;
import org.apache.commons.lang3.*;
public class Liczba implements Wyrazenie {
    private double wartosc;
    @Override
    public double wartosc() {
        return wartosc;
    }
    Liczba(double wartosc) {
        this.wartosc = wartosc;
    }
    public static void main(String[] args) {
        Wyrazenie w1 = new Roznica(new Suma(new Liczba(10), new Iloraz(new Iloczyn(new Liczba(2), new Liczba(15)), new Liczba(3))), new Liczba(4));
        System.out.println((w1.wartosc()));
        String test = "^ + 10 / * 2 15 3";
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź działanie oddzielone spacjami");
        String dzialanie = scan.nextLine();
        //String dzialanie = test;
        Stack<Wyrazenie> stos = new Stack<>();
        String[] aftersplit = dzialanie.split(" ");
        ArrayUtils.reverse(aftersplit);
        for( int i=0; i < aftersplit.length; i++){
                if(aftersplit[i].equals("+"))
                {
                    Wyrazenie first = stos.pop();
                    Wyrazenie second = stos.pop();
                    stos.push( new Suma( first,second ) );
                }
                else if(aftersplit[i].equals("-"))
                {
                    Wyrazenie first = stos.pop();
                    Wyrazenie second = stos.pop();
                    stos.push( new Roznica( first,second ) );
                }
                else if(aftersplit[i].equals("*"))
                {
                    Wyrazenie first = stos.pop();
                    Wyrazenie second = stos.pop();
                    stos.push( new Iloczyn( first,second ) );
                }
                else if(aftersplit[i].equals("/"))
                {
                    Wyrazenie first = stos.pop();
                    Wyrazenie second = stos.pop();
                    stos.push( new Iloraz( first,second ) );
                }
                else if(aftersplit[i].equals("^"))
                {
                    Wyrazenie zero =stos.pop();
                    stos.push( new Podwojenie( zero ) );
                }
                else
                {
                    stos.push( new Liczba( Double.parseDouble( aftersplit[i] ) ) );
                }
        } System.out.println(stos.pop().wartosc());
    }
}
