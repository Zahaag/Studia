package lab2;

public class StanZamknięty implements StanSklepu {
    @Override
    public void kupuj() {
    System.out.println("Nie można kupić, bo sklep jest zamknięty.");

    }
    
}
