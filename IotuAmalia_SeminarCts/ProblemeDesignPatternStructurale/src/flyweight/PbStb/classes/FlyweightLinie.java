package flyweight.PbStb.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightLinie {
    private Map<Integer,ILinie> linieMap= new HashMap<>();

    public ILinie getLinie(int nrLinie){
        ILinie linie=linieMap.get(nrLinie);
        if(linie==null){
            linie=new Linie(nrLinie,"drumul taberei","piata presei");
            linieMap.put(nrLinie,linie);
        }
        return linie;
    }
}
