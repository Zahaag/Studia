public class Okrag extends AbstrakcyjnaFigura  {
    Okrag(Kolor kolor) {
        super(kolor);
    }

    @Override
    public void rysuj() {
    System.out.println("Rysuje "+kolor.uzyjkoloru()+" Okrag");
    }
}
