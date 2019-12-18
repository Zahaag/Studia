import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BlokTekstu {
    ArrayList<Znak> lista;
    FlyweightFactory FwF;
    void add(String s){
        char[] charArray = s.toCharArray();
        for(int i =0; i<charArray.length;i++){
            add(charArray[i]);
        }
    }
    void add(char c){
        lista.add(FwF.getZnak(c));
    }
    BlokTekstu(){this.lista = new ArrayList<Znak>(); this.FwF = new FlyweightFactory();}
    BlokTekstu(String text){
        this(); add(text);}
    BlokTekstu(File f) throws FileNotFoundException {
        this();
        Scanner odczyt = new Scanner(f);
        String text;

        while(odczyt.hasNext()){
            text = odczyt.nextLine();
            add(text);add(System.lineSeparator());
        }
        odczyt.close();
    }
    void wypiszDuze(){
       for(int i = 0;i<lista.size();i++)
           lista.get(i).wypisz(true);

    }
    void wypiszMale(){
        for(int i = 0;i<lista.size();i++)
            lista.get(i).wypisz(false);
    }
    void wypisz(){
        boolean flag = true;
        for(int i = 0;i<lista.size();i++){
            if(lista.get(i).porownaj('.')) { lista.get(i).wypisz(false);flag = true;}
            else if(lista.get(i).porownaj(' ')) { lista.get(i).wypisz(false);}
            else if(flag == true){
            lista.get(i).wypisz(true);flag = false;}
            else {lista.get(i).wypisz(false);}
        }

    }
}
