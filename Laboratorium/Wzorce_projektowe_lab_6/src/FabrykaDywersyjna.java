public class FabrykaDywersyjna implements IFabryka {
    @Override
    public Object produkuj(TypZasobu typZasobu) {
        switch (typZasobu) {
            case Czlowiek:
                return new Komunista();
            case Bron:
                return new ImpulsElektromagnetyczny();
            case Pojazd:
                return new DronBezzalogowy();
        }
        throw new IllegalArgumentException("To nie jest Człowiek , Bron lub Pojazd");
    }
    private static FabrykaDywersyjna instance;
    public static FabrykaDywersyjna getInstance(){if(instance == null) instance = new FabrykaDywersyjna();
        return instance;};
    private FabrykaDywersyjna(){
        System.out.println("Powstała fabryka dywersyjna");
    }
}
