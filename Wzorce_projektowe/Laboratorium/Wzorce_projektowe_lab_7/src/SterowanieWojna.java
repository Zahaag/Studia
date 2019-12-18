import java.util.Random;

public class SterowanieWojna implements ISterowanieWojna {
private Random r;
    private static SterowanieWojna instance ;
    public static SterowanieWojna getInstance(){
        if(instance == null) instance = new SterowanieWojna();
        return instance;};

    SterowanieWojna(){
        r= new Random();
        System.out.println("Utworzono system.");
    }
    @Override
    public Wynik rozpocznijAtak(String cel) {
       int tmp = r.nextInt(100);
        if(tmp>49){System.out.println("Atak zakończono powodzeniem"); return Wynik.SUKCES; }
        else {System.out.println("Atak zakończono bez powodzeniem"); return Wynik.PORAZKA;}
    }

    @Override
    public Wynik rozpocznijObrone(String miasto) {
        int tmp = r.nextInt(100);
        if(tmp>19){System.out.println("Obrona zakończono powodzeniem");return Wynik.SUKCES;}
        else {System.out.println("Atak zakończono bez powodzeniem"); return Wynik.PORAZKA;}
    }

    @Override
    public Wynik produkujZasoby(String jakie) {
        System.out.println(jakie+" utworzono z powodzeniem");
        return Wynik.SUKCES;
    }
}
