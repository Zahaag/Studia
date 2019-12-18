public class SterowanieWojnaProxy {
    private Ranga ranga ;
    private SterowanieWojna SW = null;
    SterowanieWojnaProxy(Ranga ranga){
        this.ranga=ranga;
    }
   Wynik atak(String cel ){
        if(ranga == Ranga.GENERAL) {
            SW = SW.getInstance();
            System.out.println("Atakuj "+cel);
            return SW.rozpocznijAtak(cel);
        }
       else {System.out.println("Brak dostępu");
        return Wynik.BRAK_DOSTEPU;}
   }
   Wynik obrona(String miasto)
   {
       if(ranga == Ranga.GENERAL || ranga == Ranga.OFICER) {
          SW =  SW.getInstance();
           System.out.println("Broń "+miasto);
           return SW.rozpocznijObrone(miasto);
       }
       else {System.out.println("Brak dostępu");
       return Wynik.BRAK_DOSTEPU;}
   }
   Wynik zasoby(String jakie) {
       if (ranga == Ranga.GENERAL || ranga == Ranga.OFICER) {
          SW =  SW.getInstance();
           System.out.println("Produkuj " + jakie);
           return SW.produkujZasoby(jakie);
       }
       else {System.out.println("Brak dostępu");
       return Wynik.BRAK_DOSTEPU;}
   }
}
