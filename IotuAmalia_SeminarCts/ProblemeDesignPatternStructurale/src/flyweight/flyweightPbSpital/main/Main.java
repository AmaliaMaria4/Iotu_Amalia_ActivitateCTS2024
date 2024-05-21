package flyweight.flyweightPbSpital.main;

import flyweight.flyweightPbSpital.classes.FabricaDeSaloane;
import flyweight.flyweightPbSpital.classes.ISalon;
import flyweight.flyweightPbSpital.classes.Salon;

public class Main {
    public static void main(String[] args) {
//        Pacient pacient1=new Pacient("Andrei","0789372853","Str. Viorelelor");
//        Pacient pacient2=new Pacient("Ana","0767819230","Str. Margeanului");
//        FabricaDeSaloane fabricaDeSaloane=new FabricaDeSaloane();
//
//        ISalon salon1=fabricaDeSaloane.getSalon("salon 1","07689","str 1");
//        salon1.descriere(pacient1);
//        ISalon salon2=fabricaDeSaloane.getSalon("salon 2","0854676","str 2");
//        salon2.descriere(pacient1);

        Salon salon1=new Salon(2,4,2);
        Salon salon2=new Salon(5,3,1);

        FabricaDeSaloane fabricaDeSaloane1=new FabricaDeSaloane();
        ISalon isalon1=fabricaDeSaloane1.getSalon("ana");
        isalon1.descriere(salon1);
        isalon1.descriere(salon2);
    }
}
