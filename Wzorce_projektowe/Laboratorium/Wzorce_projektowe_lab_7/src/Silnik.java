public class Silnik {
    public static void main(String[] args){
        SterowanieWojnaProxy general = new SterowanieWojnaProxy(Ranga.GENERAL);
        SterowanieWojnaProxy oficer = new SterowanieWojnaProxy(Ranga.OFICER);
        SterowanieWojnaProxy szeregowy = new SterowanieWojnaProxy(Ranga.SZEREGOWY);
    general.atak("Londyn");
    general.obrona("Białystok");
    general.zasoby("Jedzenie");
    oficer.atak("Paryż");
    oficer.obrona("Warszawa");
    oficer.zasoby("Woda");
    szeregowy.atak("Chiny");
    szeregowy.obrona("Wieś");
    szeregowy.zasoby("Prowiant");
    }
}
