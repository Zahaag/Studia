
public class Kolo implements Figura {
    double promien;
    void setPromien(double promien){
        promien =this.promien;
    }
    double getPromien(){
        return this.promien;
    }
    @Override
    public double getObwod()
    {
        return 2*promien*3.14;
    }
    @Override
    public double getPole(){
        return promien*promien*3.14;
    }
}
