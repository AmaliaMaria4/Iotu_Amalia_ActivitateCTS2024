package flyweight.flyweightPbFarmacie.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Integer,IReteta> factory;

    public FlyweightFactory() {
        this.factory = new HashMap<>();
    }

    public IReteta getFlyweight(int nrAsigurare){
        if(factory.containsKey(nrAsigurare)){
            return factory.get(nrAsigurare);
        }else{
            Client client=new Client("-",nrAsigurare);
            factory.put(nrAsigurare,client);
            return client;
        }
    }
}
