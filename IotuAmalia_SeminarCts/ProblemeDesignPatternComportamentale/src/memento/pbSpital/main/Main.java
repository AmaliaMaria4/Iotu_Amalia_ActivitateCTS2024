package memento.pbSpital.main;

import memento.pbSpital.classes.ManagerMemento;
import memento.pbSpital.classes.Memento;
import memento.pbSpital.classes.Spital;

public class Main {
    public static void main(String[] args) {

        Spital spital = new Spital();

        spital.adaugaRezultatOnline("Rezultat 1");
        spital.adaugaRezultatOnline("Rezultat 2");
        spital.adaugaRezultatOnline("Rezultat 3");
        spital.afiseazaRezultateOnline();

        ManagerMemento managerMemento = new ManagerMemento();
        managerMemento.adaugaMemento(spital.creareMemento());


        spital.adaugaRezultatOnline("Rezultat 4");
        spital.afiseazaRezultateOnline();

        Memento ultimulMemento = managerMemento.getLastMemento();
        if (ultimulMemento != null) {
            spital.restaurareMemento(ultimulMemento);
            spital.afiseazaRezultateOnline();
        } else {
            System.out.println("Nu există memento-uri salvate.");
        }
    }
}
