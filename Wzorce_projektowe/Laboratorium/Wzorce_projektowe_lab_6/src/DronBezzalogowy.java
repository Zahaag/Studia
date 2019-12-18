public class DronBezzalogowy implements IPojazd {
    @Override
    public void ruszaj() {
        System.out.println("Wszystko widać z nieba. Nawet nie więdzą, że ich obserwujem");
    }
    DronBezzalogowy(){
        System.out.println("Powstał dron bezzałogowy");
    }
}
