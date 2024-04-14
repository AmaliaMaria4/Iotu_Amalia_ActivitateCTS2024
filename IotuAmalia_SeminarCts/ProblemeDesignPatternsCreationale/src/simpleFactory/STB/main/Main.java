package simpleFactory.STB.main;

import simpleFactory.STB.classes.FabricaTransport;
import simpleFactory.STB.classes.IMijlocTransport;
import simpleFactory.STB.classes.TipMijlocTransport;

public class Main {
    public static void main(String[] args) {
        FabricaTransport fabricaTransport=new FabricaTransport();
        IMijlocTransport iMijlocTransport=null;

        try{
            iMijlocTransport=fabricaTransport.createObject(TipMijlocTransport.autobuz);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        iMijlocTransport.descriere();
    }
}
