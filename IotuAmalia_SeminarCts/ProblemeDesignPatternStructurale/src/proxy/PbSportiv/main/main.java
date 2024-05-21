package proxy.PbSportiv.main;

import proxy.PbSportiv.classes.IVanzareBilete;
import proxy.PbSportiv.classes.Persoana;
import proxy.PbSportiv.classes.Proxy;
import proxy.PbSportiv.classes.VanzareBilet;


public class main {
    public static void main(String[] args) {
        IVanzareBilete vanzareBilet = new VanzareBilet();
        Persoana persoana1 = new Persoana("ion",12);
        vanzareBilet.vindeBilet(persoana1);


 IVanzareBilete proxyVarsta=new Proxy(vanzareBilet);
        proxyVarsta.vindeBilet(persoana1);


    }
}
