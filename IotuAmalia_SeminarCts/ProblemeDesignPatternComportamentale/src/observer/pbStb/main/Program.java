package observer.pbStb.main;


import observer.pbStb.classes.Autobuz;
import observer.pbStb.classes.Calator;
import observer.pbStb.classes.ICalator;
import observer.pbStb.classes.MijlocTransport;

public class Program {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz(168);
        ICalator calator1 = new Calator("Popescu");
        ICalator calator2 = new Calator("Ionescu");
        ICalator calator3 = new Calator("Gigescu");

        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);

        autobuz.anuntaCalatori();

      autobuz.eliminaCalator(calator2);
     autobuz.adaugaCalator(calator3);
//
      autobuz.anuntaCalatori();

    }
}
