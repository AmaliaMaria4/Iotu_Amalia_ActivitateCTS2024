package flyweight.flyweightPbSportiv.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> factory;

    public FlyweightFactory() {
        this.factory = new HashMap<>();
    }

    public Flyweight getFlyweight(String pozitie) {
        if (factory.containsKey(pozitie)) {
            return factory.get(pozitie);
        } else {
            // În loc de a crea un client, creați o persoană în funcție de poziția în tribună
            Persoana persoana = new Persoana(0,0,pozitie,"-");
            factory.put(pozitie, persoana);
            return persoana;
        }
    }
}