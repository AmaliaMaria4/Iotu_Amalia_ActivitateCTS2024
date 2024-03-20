package factoryMethod.main;

import factoryMethod.classes.*;

public class Main {

    public static void afisarePersonal(FabricaPersonal fabricaPersonal, String nume, int salariu){
       PersonalSpital personalSpital=fabricaPersonal.createPersonal(nume,salariu);
        System.out.println(personalSpital.toString());
    }
    public static void main(String[] args) {
        FabricaPersonal fabricaBrancardier=new FabricaBrancardier();
        FabricaPersonal fabricaMedic=new FabricaMedic();
        FabricaPersonal fabricaAsistent=new FabricaAsistent();

        PersonalSpital medic= fabricaMedic.createPersonal("Ionescu Ana",12000);
        PersonalSpital asistent= fabricaAsistent.createPersonal("Georgescu Ion",16200);
        PersonalSpital brancardier=  fabricaBrancardier.createPersonal("Nitu Marius",15400);

        medic.afisareAngajati();
        asistent.afisareAngajati();
        brancardier.afisareAngajati();
        System.out.println();

        afisarePersonal(new FabricaMedic(),"Ionescu Ana",12000);
        afisarePersonal(new FabricaAsistent(),"Georgescu Ion",16200);
        afisarePersonal(new FabricaBrancardier(),"Nitu Marius",15400);

    }
}