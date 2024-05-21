package facade.PbSpital.classes;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<String> paturiLibere;

    public Salon() {
        this.paturiLibere = new ArrayList<>();
        for (int i = 1; i <= 10; i++) { // presupunând că sunt 10 paturi în salon
            paturiLibere.add("Pat" + i);
        }
    }

    public boolean arePatLiber() {
        return !paturiLibere.isEmpty();
    }
}
