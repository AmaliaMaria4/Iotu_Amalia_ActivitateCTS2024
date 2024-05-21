package flyweight.flyweightPbSportiv.main;

import flyweight.flyweightPbSportiv.classes.Flyweight;
import flyweight.flyweightPbSportiv.classes.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        // Desenarea persoanelor în tribună
        Flyweight persoana1 = flyweightFactory.getFlyweight("A1");
        persoana1.deseneazaPersoana(180, 60, "A1", "Rosu");

        Flyweight persoana2 = flyweightFactory.getFlyweight("B3");
        persoana2.deseneazaPersoana(170, 65, "B3", "Albastru");

        // Alte desene de persoane în tribună...
    }
}