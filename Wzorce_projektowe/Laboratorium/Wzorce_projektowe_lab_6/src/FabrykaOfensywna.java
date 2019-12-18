public class FabrykaOfensywna implements IFabryka {
    @Override
    public Object produkuj(TypZasobu typZasobu) {
        switch (typZasobu) {
            case Czlowiek:
                return new KomandosGROM();
            case Bron:
                return new AK47();
            case Pojazd:
                return new MysliwiecF16();
        }
        throw new IllegalArgumentException("To nie jest Człowiek , Bron lub Pojazd");
    }
    private static FabrykaOfensywna instance ;
    public static FabrykaOfensywna getInstance(){if(instance == null) instance = new FabrykaOfensywna();
    return instance;};
    private FabrykaOfensywna(){
        System.out.println("Powstała fabryka ofensywna");
    }
}
