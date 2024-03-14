package simpleFactory.main;

import simpleFactory.classes.FabricaPersonal;
import simpleFactory.classes.PersonalSpital;
import simpleFactory.classes.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FabricaPersonal fabricaPersonal=new FabricaPersonal();
        try {
            PersonalSpital medic=fabricaPersonal.crearePersonal(TipPersonal.MEDIC,"Ionescu Mihai",5400);
            PersonalSpital asistent=fabricaPersonal.crearePersonal(TipPersonal.ASISTENT,"Popescu Ioana",6500);
            PersonalSpital brancardier=fabricaPersonal.crearePersonal(TipPersonal.BRANCARDIER,"Grigore Denisa",12000);
            medic.afisarePersonal();
            asistent.afisarePersonal();
            brancardier.afisarePersonal();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
