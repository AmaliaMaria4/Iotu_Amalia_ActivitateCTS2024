package decorator.PbSportiv.main;

import decorator.PbSportiv.classes.Decorator;
import decorator.PbSportiv.classes.DecoratorAbstract;
import decorator.PbSportiv.classes.Iimprimanta;
import decorator.PbSportiv.classes.ImprimantaBilete;

public class Program {
    public static void main(String[] args) {
        Iimprimanta imprimanta = new ImprimantaBilete(5);
        imprimanta.printeazaBilet();
        DecoratorAbstract decorator = new Decorator(imprimanta, "Paste fericit!");
        decorator.printeazaBilet();
        decorator.printeazaMesaj();
    }
}
