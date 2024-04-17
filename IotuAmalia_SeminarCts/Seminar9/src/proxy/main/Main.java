package proxy.main;

import proxy.classes.Persoana;
import proxy.classes.ProxyVarsta;
import proxy.classes.Vanzare;
import proxy.classes.VanzareBilet;

public class Main {
    public static void main(String[] args) {
        Vanzare vanzareBilet = new VanzareBilet("Rapid-Steaua", 25);
        Persoana persoana1 = new Persoana("Popescu", 24, "masculin");
        Persoana persoana2 = new Persoana("Ionescu", 12, "feminin");
        vanzareBilet.vinde(persoana1);
        vanzareBilet.vinde(persoana2);

        Vanzare proxyVarsta = new ProxyGen(vanzareBilet,"masculin");
        proxyVarsta.vinde(persoana1);
        proxyVarsta.vinde(persoana2);
    }
}
