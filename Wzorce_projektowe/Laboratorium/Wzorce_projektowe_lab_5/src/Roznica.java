public class Roznica implements Wyrazenie {
    @Override
    public double wartosc() {
        return (double)a.wartosc()-b.wartosc();
    }
    private Wyrazenie a,b;
    Roznica(Wyrazenie a,Wyrazenie b)
    {
        this.a=a;
        this.b=b;
    }
}
