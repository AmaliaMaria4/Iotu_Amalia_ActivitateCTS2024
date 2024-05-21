package flyweight.flyweightPbRestaurant.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> factory;

    //constructir cu parametrii, dar sterg ce am in paranteza,iar la this.factory=new HashMap<>();
    public FlyweightFactory() {
        this.factory = new HashMap<>();
    }

    //metoda getFlywight //nrTelefon este cheie
    public Flyweight getFlyweight(String nrTelefon) {
        if (factory.containsKey(nrTelefon)) {
            return factory.get(nrTelefon);
        } else {
            Client client = new Client("-", nrTelefon, "-");
            factory.put(nrTelefon,client);
            return client;
        }
    }
}
