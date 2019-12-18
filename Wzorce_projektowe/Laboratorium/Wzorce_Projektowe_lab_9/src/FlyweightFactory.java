import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<Character, Znak> flyweights;
    public FlyweightFactory(){
        flyweights = new HashMap<Character, Znak>();
    }
    public Znak getZnak(char z)
    {   if(z >= 'A' && z <='Z')
        {z = Character.toLowerCase(z);}
        if(!flyweights.containsKey(z))
            flyweights.put(z,new Znak(z));
        return flyweights.get(z);
    }
}
