package flyweight.flyweightPbSTB.classes;


import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<Integer, Linie> linieMap;

    public FlyweightFactory() {
        linieMap = new HashMap<>();

    }

    public Linie getLinie(int nrLinie) {
//        Linie linieDeReturnat = linieMap.get(nrLinie);
//        if (linieDeReturnat != null) {
//            return linieDeReturnat;
//        } else {
//            linieDeReturnat = new Linie(nrLinie, "Prima statie", "Ultima statie");
//            linieMap.put(linieDeReturnat.getNrLinie(), linieDeReturnat);
//            return linieDeReturnat;
      if(linieMap.containsKey(nrLinie)){
            return linieMap.get(nrLinie);
        }else{
          Linie linie=new Linie(0,"-","-");
          linieMap.put(nrLinie,linie);
          return linie;
      }
    }
}
