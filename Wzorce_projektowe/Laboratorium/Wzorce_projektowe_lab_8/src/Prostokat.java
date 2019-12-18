public class Prostokat extends AbstrakcyjnaFigura {
    Prostokat(Kolor kolor) {
        super(kolor);
    }

    @Override
    public void rysuj() {
        System.out.println("Rysuje "+kolor.uzyjkoloru()+" Prostokat");

    }
}
