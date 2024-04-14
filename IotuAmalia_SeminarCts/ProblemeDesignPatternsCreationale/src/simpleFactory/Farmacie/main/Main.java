package simpleFactory.Farmacie.main;

import simpleFactory.Farmacie.classes.FabricaFarmacie;
import simpleFactory.Farmacie.classes.ICategorieMedicamente;
import simpleFactory.Farmacie.classes.TipMedicament;

public class Main {
    public static void main(String[] args) {
        FabricaFarmacie fabricaFarmacie=new FabricaFarmacie();
        ICategorieMedicamente iCategorieMedicamente=null;
        try{
            iCategorieMedicamente=fabricaFarmacie.createObject(TipMedicament.body);
        }catch (Exception e){
            e.printStackTrace();
        }
        iCategorieMedicamente.descriere();
    }
}
