public class Iloraz implements Wyrazenie {
    @Override
    public double wartosc() {
        if(b.wartosc()==0)
        throw new ArithmeticException("Dzielenie przez 0");
            return (double)a.wartosc()/b.wartosc();
    }
    private Wyrazenie a,b;
    Iloraz(Wyrazenie a,Wyrazenie b)
    {
        this.a=a;
        this.b=b;
    }
}
