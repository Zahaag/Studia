public class Database {
    Database(){};
    public static float GetCriticalPoint(String compound, String point) {
        switch (point) {
            case "M": {
                if (compound.equals( "flutrimazol"))
                    return 808;
                if (compound.equals( "kolesewelam"))
                    return 320;
                if (compound.equals( "amlodypina"))
                    return 393;
                if (compound.equals( "tiabendazol"))
                    return 201;
                break;
            }
            case "B": {
                if (compound.equals( "flutrimazol"))
                    return 1408;
                if (compound.equals( "kolesewelam"))
                    return 520;
                if (compound.equals( "amlodypina"))
                    return 593;
                if (compound.equals( "tiabendazol"))
                    return 25;
                break;
            }
            case "F": {
                if (compound.equals( "flutrimazol"))
                    return 0;
                if (compound.equals( "kolesewelam"))
                    return 80;
                if (compound.equals( "tiabendazol"))
                    return -5;
                break;
            }
            default: {
                return Float.MIN_VALUE;
            }
        }
        return Float.MIN_VALUE;
    }
    public static String GetMoolecularStructure(String compound){
        if(compound.equals( "flutrimazol"))
            return "C22H16F2N2" ;
        else if(compound.equals( "kolesewelam"))
            return  "C31H67Cl3NO4" ;
       else if(compound.equals( "amlodypina"))
            return "C20H25ClN2O5";
        else if(compound.equals( "tiabendazol"))
            return "C10H7N3S" ;
        else return "Unknown";
    }
    public static double GetMolecularWeight(String compound){
        if(compound.equals( "flutrimazol"))
            return 346.37 ;
        else if(compound.equals( "kolesewelam"))
            return  618.2;
        else if(compound.equals( "amlodypina"))
            return 408.88;
        else if(compound.equals( "tiabendazol"))
            return 201.25;
        else
        return Double.MIN_VALUE;
    }


}


