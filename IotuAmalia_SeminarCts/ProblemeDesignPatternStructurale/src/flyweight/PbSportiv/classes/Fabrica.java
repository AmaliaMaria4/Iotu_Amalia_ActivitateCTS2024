package flyweight.PbSportiv.classes;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map<String, Flyweight> spectatori;

    public Fabrica() {
        this.spectatori = new HashMap<>();
    }

    public Spectator getSpectator(int inaltime, int latime) {
        String cheie = " " + inaltime + "-" + latime;
        Spectator flyweight = (Spectator) spectatori.get(cheie);
        if (flyweight == null) {
            flyweight = new Spectator(inaltime, latime);
            spectatori.put(cheie, flyweight);

        }
        return  flyweight;
    }
}

