import java.util.Scanner;
public class Prostokat extends Wielokat {
        
    void setBok() {
        
    }

    double getBok() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ktory bok");
        String wall = scan.nextLine();
      return this.bok[Integer.valueOf(wall)];
    }

    public double getObwod() {
        return 2*bok[0]+2*bok[1];
    }

    public double getPole() {
        return bok[0]*bok[1];
    }
    Prostokat(){
    }

    
}
