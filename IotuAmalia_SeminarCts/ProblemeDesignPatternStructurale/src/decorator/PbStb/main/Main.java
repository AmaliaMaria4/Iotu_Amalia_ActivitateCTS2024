package decorator.PbStb.main;

import decorator.PbStb.classes.APrintareFelicitare;
import decorator.PbStb.classes.Bilet;
import decorator.PbStb.classes.IBilet;
import decorator.PbStb.classes.PrintareFelicitare;

public class Main {
    public static void main(String[] args) {
        IBilet bilet1=new Bilet("139",3);
        bilet1.printareBilet();
        System.out.println();
        APrintareFelicitare felicitare1=new PrintareFelicitare(bilet1);
        felicitare1.printareBilet();
        felicitare1.printareMesaj();
//        bilet1.printareBilet();

    }
}
