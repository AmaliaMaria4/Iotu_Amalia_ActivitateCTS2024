package flyweight.PbStb.main;

import flyweight.PbStb.classes.AutobuzLinie;
import flyweight.PbStb.classes.FlyweightLinie;
import flyweight.PbStb.classes.ILinie;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie autobuzLinie1=new AutobuzLinie("mercedes",2024,30);
        AutobuzLinie autobuzLinie2=new AutobuzLinie("audi",2020,24);

        FlyweightLinie flyweightLinie=new FlyweightLinie();
        ILinie linie1= flyweightLinie.getLinie(41);
       linie1.descriere(autobuzLinie1);
       linie1.descriere(autobuzLinie2);


//        System.out.println();
//
//
//        flyweightLinie.getLinie(41).descriere(autobuzLinie1);
//        flyweightLinie.getLinie(41).descriere(autobuzLinie2);
    }
}
