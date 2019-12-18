public class MysliwiecF16 implements IPojazd {
    @Override
    public void ruszaj() {
        System.out.println("Wszystkie samoloty wroga zostały już zdjęte! Sir!");
    }
    MysliwiecF16(){
        System.out.println("Powstał samolot Mysliwiec F16");
    }
}
