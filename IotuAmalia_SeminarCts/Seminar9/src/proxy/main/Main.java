package proxy.main;

import proxy.classes.*;

public class Main {
    public static void main(String[] args) {
        Vanzare vanzareBilet = new VanzareBilet("Rapid-Steaua", 25);
        Persoana persoana1 = new Persoana("Popescu", 24, "masculin");
        Persoana persoana2 = new Persoana("Ionescu", 12, "feminin");
        vanzareBilet.vinde(persoana1);
        vanzareBilet.vinde(persoana2);

        Vanzare proxyVarsta=new ProxyVarsta(vanzareBilet);
        proxyVarsta.vinde(persoana1);
        proxyVarsta.vinde(persoana2);
        Vanzare proxyGen=new ProxyGen(proxyVarsta,"masculin");
        proxyGen.vinde(persoana1);
        proxyGen.vinde(persoana2);

    }
}