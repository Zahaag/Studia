public class Podwojenie implements Wyrazenie {
    @Override
    public double wartosc() {
        return 2.0*a.wartosc();
    }
    Podwojenie(Wyrazenie a){
        this.a = a;
    }
    private Wyrazenie a;
}
