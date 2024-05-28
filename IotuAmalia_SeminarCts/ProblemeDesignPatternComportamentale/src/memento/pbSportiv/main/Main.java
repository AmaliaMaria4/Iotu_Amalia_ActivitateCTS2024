package memento.pbSportiv.main;

import memento.pbSportiv.classes.ManagerMementoMeci;
import memento.pbSportiv.classes.Meci;
import memento.pbSportiv.classes.MementoMeci;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Meci meci1=new Meci("12 apr", List.of("echipa1","echipa2"),20,20,12,4,5);
        MementoMeci mementoMeci=meci1.salvareMemento();
        System.out.println(meci1.toString());
        System.out.println(mementoMeci.toString());
        meci1.setDataMeci("14 apr");
        meci1.setNrSpectatoti(25);
        System.out.println(meci1.toString());
        MementoMeci mementoMeci2=meci1.salvareMemento();
        System.out.println(mementoMeci2.toString());

        ManagerMementoMeci managerMementoMeci=new ManagerMementoMeci();
        managerMementoMeci.adaugaMemento(mementoMeci);
        managerMementoMeci.adaugaMemento(mementoMeci2);

        System.out.println(managerMementoMeci.lastMemento());


        meci1.undoMemento(mementoMeci);
        System.out.println(meci1.toString());
    }
}
