package simpleFactory.Spital.main;

import simpleFactory.Spital.classes.FabricaPersonalSpital;
import simpleFactory.Spital.classes.IPersonalSpital;
import simpleFactory.Spital.classes.TipAngajati;

public class Main {
    public static void main(String[] args) {
        FabricaPersonalSpital fabrica = new FabricaPersonalSpital();
        IPersonalSpital iPersonalSpital =null;

        try{
            iPersonalSpital=fabrica.createObiect(TipAngajati.medic);
            iPersonalSpital.descriere();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
