public class Suma implements Wyrazenie {
    @Override
    public double wartosc() {
        return (double)a.wartosc()+b.wartosc();
    }
    Suma(Wyrazenie a,Wyrazenie b)
    {
        this.a=a;
        this.b=b;
    }
    private Wyrazenie a,b;
}
