import java.util.ArrayList;

public class Dowodzenie {
    public static void main(String[] args){
IFabryka  def = FabrykaDefensywna.getInstance();
IFabryka ofe = FabrykaOfensywna.getInstance();
IFabryka partyzantka = FabrykaDywersyjna.getInstance();
        ArrayList<Object> lista = zasoby(def);
        lista.add(zasoby(def));
        lista.add(zasoby(partyzantka));
        lista.add(zasoby(partyzantka));
        lista.add(zasoby(ofe));
        lista.add(zasoby(ofe));
    }
    static ArrayList zasoby(IFabryka s){
        ArrayList<Object> lista = new ArrayList<>();
        lista.add(s.produkuj(TypZasobu.Czlowiek));
        lista.add(s.produkuj(TypZasobu.Bron));
        lista.add(s.produkuj(TypZasobu.Pojazd));
        return lista;
    }

}
