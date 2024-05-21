package composite.PbStb.main;

import composite.PbStb.classes.AutobuzComposite;
import composite.PbStb.classes.AutobuzFrunza;
import composite.PbStb.classes.IComponenta;

public class Main {
    public static void main(String[] args) {
        IComponenta autobuzCo1=new AutobuzComposite("Grup mare 1");
        IComponenta autobuzCo2=new AutobuzComposite("Grup mediu 1");
        IComponenta autobuzCo3=new AutobuzComposite("Grup mediu 2");
        IComponenta autobuzF1=new AutobuzFrunza("Grup mic 1");
        IComponenta autobuzF2=new AutobuzFrunza("Grup mic 2");
        IComponenta autobuzF3=new AutobuzFrunza("Grup mic 3");
        IComponenta autobuzF4=new AutobuzFrunza("Grup mic 4");
        IComponenta autobuzF5=new AutobuzFrunza("Grup mic 5");
        IComponenta autobuzF6=new AutobuzFrunza("Grup mic 6");
        autobuzCo1.adaugaComponenta(autobuzCo2);
        autobuzCo1.adaugaComponenta(autobuzCo3);
        autobuzCo2.adaugaComponenta(autobuzF1);
        autobuzCo2.adaugaComponenta(autobuzF2);
        autobuzCo2.adaugaComponenta(autobuzF3);
        autobuzCo3.adaugaComponenta(autobuzF4);
        autobuzCo3.adaugaComponenta(autobuzF5);
        autobuzCo3.adaugaComponenta(autobuzF6);
        autobuzCo1.desceriere(" ");
    }
}
