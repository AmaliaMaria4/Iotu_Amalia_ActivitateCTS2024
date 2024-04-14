package factoryMethod.Sportiv.main;

import factoryMethod.Sportiv.classes.FactoryAtacant;
import factoryMethod.Sportiv.classes.FactoryJucator;
import factoryMethod.Sportiv.classes.Jucator;

public class Main {

    public static void printeazaJucator(FactoryJucator fabrica, String nume, int varsta, int inaltime, int nrTricouAtacant, int nrTricouFundas, int nrTricouPortar){
        Jucator jucator=fabrica.getJucator(nume,varsta,inaltime,nrTricouAtacant,nrTricouFundas,nrTricouPortar);
       System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        printeazaJucator(new FactoryAtacant(),"alin",23,1,12,0,0);

    }
}
