package prototype.main;

import prototype.classes.Reteta;
import prototype.classes.RetetaAbstracta;
import prototype.classes.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Double> solutii=new HashMap<>();
        solutii.put("solutie1",21.5);
        solutii.put("solutie2",12.3);
        Reteta prototip=new Reteta(solutii,"Nurofen");
        RetetaAbstracta reteta= prototip.clone();
        System.out.println(reteta);


        RetetaCrema retetaCremaPrototip=new RetetaCrema("Nivea",2);
        RetetaAbstracta retetaCrema=  retetaCremaPrototip.clone();
        System.out.println(retetaCrema);
    }
}
