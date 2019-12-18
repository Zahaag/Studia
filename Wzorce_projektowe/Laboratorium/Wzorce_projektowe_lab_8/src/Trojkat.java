public class Trojkat extends AbstrakcyjnaFigura {
    Trojkat(Kolor kolor) {
        super(kolor);
    }

    @Override
    public void rysuj() {
        System.out.println("Rysuje "+kolor.uzyjkoloru()+" Trojkat");

    }
}
