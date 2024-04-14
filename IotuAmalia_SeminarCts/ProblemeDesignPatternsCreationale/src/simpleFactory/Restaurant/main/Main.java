package simpleFactory.Restaurant.main;

import simpleFactory.Restaurant.classes.FabricaRestaurant;
import simpleFactory.Restaurant.classes.IMeniu;
import simpleFactory.Restaurant.classes.TipSupe;

public class Main {
    public static void main(String[] args) {
        FabricaRestaurant fabrica=new FabricaRestaurant();
        IMeniu iMeniu=null;

        try{
            iMeniu= (IMeniu) fabrica.createObject(TipSupe.supaCiuperci);

        }catch (Exception e){
            e.printStackTrace();
        }
        iMeniu.descriere();
        try{
            iMeniu= (IMeniu) fabrica.createObject(TipSupe.supaLegume);

        }catch (Exception e){
            e.printStackTrace();
        }
        iMeniu.descriere();
    }
}
