package flyweight.flyweightPbBanca.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,ICont> contMap;

    public FlyweightFactory() {
        this.contMap = new HashMap<>();
    }

    public ICont getFlyweight(String nrTelClient){
        if(contMap.containsKey(nrTelClient)){
            return contMap.get(nrTelClient);
        }else{
            Client client=new Client("-","-",nrTelClient,"-");
            contMap.put(nrTelClient,client);
            return client;
        }
    }
}
