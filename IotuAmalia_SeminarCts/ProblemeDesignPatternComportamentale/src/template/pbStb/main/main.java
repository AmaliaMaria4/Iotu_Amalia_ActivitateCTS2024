package template.pbStb.main;


import template.pbStb.classes.MijlocTransportPeSine;
import template.pbStb.classes.Tramvai;

public class main {
    public static void main(String[] args) {
        MijlocTransportPeSine tramvai = new Tramvai("ion");
        tramvai.parcurgeTraseuInSensNormal();
        System.out.println("-----------------");
        tramvai.parcurgeTraseuInSensInvers();

        //tramvai.opresteInStatia2();
    }
}
