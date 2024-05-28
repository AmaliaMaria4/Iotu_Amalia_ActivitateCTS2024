package chain.pbSTB.main;

import chain.pbSTB.classes.*;

public class Main {
    public static void main(String[] args) {
        MijlocTransport mijlocTransport1=new Autobuz();
        MijlocTransport mijlocTransport2=new Troleibuz();
        MijlocTransport mijlocTransport3=new Tramvai();
        MijlocTransport mijlocTransport4=new Metrou();

        Calator calator1=new Calator(11,"ion");
        mijlocTransport2.setMijlocTransport(mijlocTransport1);
        mijlocTransport1.setMijlocTransport(mijlocTransport3);
        mijlocTransport3.setMijlocTransport(mijlocTransport4);
        mijlocTransport1.notifica(calator1);
    }
}
