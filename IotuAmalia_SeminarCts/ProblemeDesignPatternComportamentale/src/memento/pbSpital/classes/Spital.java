package memento.pbSpital.classes;

import java.util.ArrayList;
import java.util.List;

public class Spital {
    private List<String> rezultateOnline = new ArrayList<>();

    public void adaugaRezultatOnline(String rezultat) {
        rezultateOnline.add(rezultat);
    }

    public void afiseazaRezultateOnline() {
        System.out.println("Rezultatele online:");
        for (String rezultat : rezultateOnline) {
            System.out.println(rezultat);
        }
    }

    public Memento creareMemento() {
        return new Memento(new ArrayList<>(rezultateOnline));
    }

    public void restaurareMemento(Memento memento) {
        rezultateOnline = memento.getRezultateSalvate();
    }
}
