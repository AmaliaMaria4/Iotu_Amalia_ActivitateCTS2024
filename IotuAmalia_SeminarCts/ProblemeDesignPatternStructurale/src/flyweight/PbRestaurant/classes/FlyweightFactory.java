package flyweight.PbRestaurant.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    //cheie
    //client
    private Map<String, Flyweight> clienti;

    public FlyweightFactory() { // sterg din paranteza la constructorul generat
        this.clienti = new HashMap<String,Flyweight>(); //modific si aici
    }

    public Flyweight getClient(String nrTel) {
        Flyweight flyweight = clienti.get(nrTel);
        if (flyweight==null){
            flyweight=new Client("Ion",nrTel,"ion@gmail.com");
            clienti.put(nrTel,flyweight);
        }
            return flyweight;
    }
}
