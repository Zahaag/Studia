public class Znak {
    private char znak;
    private boolean czyLitera;
    Znak(char znak){
        if(znak >= 'a' && znak <='z'){
        this.znak = znak;czyLitera=true;}
       else if(znak >= 'A' && znak <='Z'){
            this.znak = znak;czyLitera=true;}
        else {
            this.znak = znak;czyLitera=false;}
    }
    void wypisz(boolean czyDuzy){
        if(czyDuzy == true && czyLitera == true){
            System.out.print(Character.toUpperCase(znak));
        }
        else if(czyDuzy == false && czyLitera == true){
            System.out.print(Character.toLowerCase(znak));
        }
        else {System.out.print(znak);}
    }
    boolean porownaj(char c){
        if(Character.toUpperCase(c) == Character.toUpperCase(this.znak))
            return true;
        else
             return false;
    }

    @Override
    public String toString() {
        return ""+znak;
    }
}
