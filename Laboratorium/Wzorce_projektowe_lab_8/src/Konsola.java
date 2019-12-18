import java.util.ArrayList;
import java.util.List;

public class Konsola {
    public static void main(String[] args)
    {
        ArrayList<Figura> f = new ArrayList<>();

        for(int i = 0; i<2; i++) {
            f.add(new Okrag(new KolorZielony()));
            f.add(new Okrag(new KolorNiebieski()));
            f.add(new Okrag(new KolorCzerwony()));
            f.add(new Prostokat(new KolorZielony()));
            f.add(new Prostokat(new KolorNiebieski()));
            f.add(new Prostokat(new KolorCzerwony()));
            f.add(new Trojkat(new KolorZielony()));
            f.add(new Trojkat(new KolorNiebieski()));
            f.add(new Trojkat(new KolorCzerwony()));
        }
        for (Figura x : f)
            x.rysuj();

    }
}
