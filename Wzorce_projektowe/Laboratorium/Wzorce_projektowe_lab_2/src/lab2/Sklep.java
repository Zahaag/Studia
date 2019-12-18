
package lab2;

public class Sklep {
    public String nazwa;
    private Sklep(){
        System.out.print("Utworzono Sklep \n");
    }
   /*    private static final Sklep instance = new Sklep();
    public static Sklep getInstance(){
        return instance;
    } */
    private static Sklep instance = null;
    public static Sklep getInstance(){
        if(instance ==null)
            instance = new Sklep();
        return instance;
    }
    private StanSklepu stan = new StanOtwarty();
    public void kupuj(){
        stan.kupuj();
    };
    public void zamknij(){stan = new StanZamknięty();}
    public void otwórz(){stan = new StanOtwarty();}
    public void remanentuj(){stan = new StanRemanent();}
    
    @Override
 public String toString(){
return this.nazwa; }
}
