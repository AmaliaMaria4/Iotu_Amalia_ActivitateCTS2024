package observer.pbStb1.main;

import observer.pbStb1.classes.Autobuz;
import observer.pbStb1.classes.Calator;
import observer.pbStb1.classes.IAutobuz;
import observer.pbStb1.classes.ICalator;

public class Main {
    public static void main(String[] args) {
        ICalator calator1=new Calator("Alex",23,123);
        ICalator calator2=new Calator("Ion",32,345);
        ICalator calator3=new Calator("Ana",65,643);
        ICalator calator4=new Calator("Elena",12,976);

        IAutobuz autobuz=new Autobuz(1);

        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);
        autobuz.trimiteNotificare("autobuzul a plecat din statie! ");
        autobuz.stergeCalator(calator2);
        autobuz.adaugaCalator(calator3);
        autobuz.trimiteNotificare("autobuzul a plecat din statie! ");

    }
}
