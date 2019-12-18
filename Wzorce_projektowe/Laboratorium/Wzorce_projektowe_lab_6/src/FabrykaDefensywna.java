public class FabrykaDefensywna implements IFabryka {
    @Override
    public Object produkuj(TypZasobu typZasobu) {
        switch (typZasobu) {
            case Czlowiek:
                return new ZolnierzWOT();
            case Bron:
                return new TarczaAntyrakietowa();
            case Pojazd:
                return new Jelcz44232();
        }
        throw new IllegalArgumentException("To nie jest Człowiek , Bron lub Pojazd");
    }
    private static  FabrykaDefensywna instance;
    public static FabrykaDefensywna getInstance(){if(instance == null) instance = new FabrykaDefensywna();
        return instance;}
    private FabrykaDefensywna(){
        System.out.println("Powstała fabryka defensywna");
    }
}
