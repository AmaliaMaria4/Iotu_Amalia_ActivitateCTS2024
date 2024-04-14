package simpleFactory.Sportiv.main;

import simpleFactory.Sportiv.classes.FabricaSportiv;
import simpleFactory.Sportiv.classes.ISportiv;
import simpleFactory.Sportiv.classes.TipJucator;

public class Main {
    public static void main(String[] args) {
        FabricaSportiv fabricaSportiv=new FabricaSportiv();
        ISportiv iSportiv=null;

        try{
            iSportiv=fabricaSportiv.createObject(TipJucator.atacant);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        iSportiv.descriere();
    }
}
