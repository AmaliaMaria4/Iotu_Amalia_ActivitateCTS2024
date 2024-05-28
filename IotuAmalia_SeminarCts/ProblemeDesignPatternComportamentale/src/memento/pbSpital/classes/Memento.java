package memento.pbSpital.classes;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private final List<String> rezultateSalvate;

    public Memento(List<String> rezultateOnline) {
        this.rezultateSalvate = new ArrayList<>(rezultateOnline);
    }

    public List<String> getRezultateSalvate() {
        return rezultateSalvate;
    }
}
