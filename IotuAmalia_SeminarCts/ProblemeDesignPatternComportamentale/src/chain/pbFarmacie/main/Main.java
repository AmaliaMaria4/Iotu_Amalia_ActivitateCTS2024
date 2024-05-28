package chain.pbFarmacie.main;

import chain.pbFarmacie.classes.AngajatFarmacie;
import chain.pbFarmacie.classes.AsistentFarmacie;
import chain.pbFarmacie.classes.Comanda;
import chain.pbFarmacie.classes.Farmacist;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comanda comanda1=new Comanda(23, List.of("med1","med2","med3"),"Preluare");
        Comanda comanda2=new Comanda(12, List.of("med4","med5","med6"),"Aducere medicamente");

        AngajatFarmacie farmacie1=new Farmacist();
        AngajatFarmacie asistent1=new AsistentFarmacie();

        farmacie1.setAngajatFarmacie(asistent1);
        farmacie1.proceseazaComanda(comanda1);
        farmacie1.proceseazaComanda(comanda2);
    }
}
