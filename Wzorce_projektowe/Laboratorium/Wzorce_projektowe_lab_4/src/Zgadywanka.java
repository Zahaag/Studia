import java.util.Random;
import java.util.Scanner;

public class Zgadywanka extends Game {
    protected void initialize(){
        System.out.println("Przygotowanie do gry");
        Liczba = r.nextInt(30);

    }
    @Override
    protected boolean gameOver() {
        return lives <=0;
    }
    @Override
    protected void makeMoves(){
        System.out.println("Podaj liczbę z zakresu od 1 do 30");
        choice = s.nextInt();
        if(choice == Liczba) {flag = true; lives =0;}

    }
    @Override
    protected void paintScreen() {
        if (choice < Liczba) {System.out.println("Szukana liczba jest większa"); lives--; }
        else if (choice > Liczba) {System.out.println("Szukana liczba jest mniejsza");lives--; }
    }
    @Override
    protected void onEnd() {
        if(flag)System.out.println("Winner");
        else
        System.out.println("Game Over");
    }
    private int lives = 4;
    private int Liczba =0;
    private int choice;
    boolean flag = false;
    private Random r = new Random();
    private Scanner s = new Scanner(System.in);
    Zgadywanka(){}
    public static void main(String[] args)
    {
        Zgadywanka s = new Zgadywanka();
        s.run();
    }
}
