import java.util.Scanner;

public class ZwiazekChemiczny extends Database implements IAdapter {
    private String nazwa_zwiazku;
    private float melting;
    private float boiling;
    private float zaplon;
    private double masa_molowa;
    private String wzor;

    ZwiazekChemiczny(String nazwa_zwiazku){
        this.nazwa_zwiazku= nazwa_zwiazku.toLowerCase();
        this.melting = Database.GetCriticalPoint(this.nazwa_zwiazku,"M");
        this.boiling = Database.GetCriticalPoint(this.nazwa_zwiazku,"B");
        this.zaplon =Database.GetCriticalPoint(this.nazwa_zwiazku,"F");
        this.masa_molowa = Database.GetMolecularWeight(this.nazwa_zwiazku);
        this.wzor = Database.GetMoolecularStructure(this.nazwa_zwiazku);
    }
    @Override
    public String stopnienLatwopalnosci() {
        if(zaplon == Float.MIN_VALUE)return("Produkt nie jest palny.");
        if(zaplon <= 90)return("Produkt jest palny: „Substancją palną nazywamy substancję, która łatwo wchodzi w reakcję spalania a jej temperatura zapłonu jest niższa niż 90°C.” ");
        if(zaplon >= 21 && zaplon<=55)return(" Produkt jest łatwopalny: „Substancje i preparaty (…) o temperaturze zapłonu od 21 °C do 55 °C”");
        if(zaplon <= 21)return ("Produkt jest wysoce łatwopalny: „Substancje i preparaty (…) o temperaturze zapłonu poniżej 21 °C, które nie są skrajnie łatwopalne.”");
        if(zaplon <= 0 && boiling <= 35)return "Produkt jest skrajnie łatwopalny: „Substancje i preparaty (…) o temperaturze zapłonu poniżej 0 °C oraz temperaturze wrzenia (…) niższej lub równej 35 °C”";
        else return "Unknown";
    }

    @Override
    public void wyswietl() {
        if(wzor != "Unknown"){
        System.out.println("Związek Chemiczny:");
        System.out.println("Nazwa: "+nazwa_zwiazku);
        System.out.println("Melting point: " +melting);
        System.out.println("Boiling point: "+boiling);
        System.out.println("Zaplon point: "+ zaplon);
        System.out.println("Masa molowa: "+masa_molowa);
        System.out.println("Wzor:" + wzor);
        System.out.println("Stopien łatwopalnosci: " + this.stopnienLatwopalnosci());
    }
        else System.out.println("Brak związku chemicznego w bazie.");
    }
    public static void main (String args[])
    { boolean t = true;
        while(t){
            System.out.println("\nAby zakończyć działanie programu wpisz 'exit'.");
            System.out.println("Podaj nazwę związku chemicznego: ");
            Scanner s = new Scanner(System.in);
            String text = s.nextLine();
            if(text.equals("exit")){t=false;}
            if(t==true){
            ZwiazekChemiczny zc = new ZwiazekChemiczny(text);
            zc.wyswietl();
            }
        }
    }
}
