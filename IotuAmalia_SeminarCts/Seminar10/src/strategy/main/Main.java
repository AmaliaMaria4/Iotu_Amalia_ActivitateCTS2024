package strategy.main;

import strategy.classes.*;

public class Main {
    public static void main(String[] args) {
        Portar portar=new Portar();
        String suporter1="GigielVIP";
        String suporter2="GigielPeluza";
        String suporter3="GigielTribuna";

        portar.setStrategie(new VerificatorVip());
        portar.verificaSuporter(suporter1);

        portar.setStrategie(new VerificatorPeluza());
        portar.verificaSuporter(suporter2);

        portar.setStrategie(new VerificatorTribuna());
        portar.verificaSuporter(suporter3);
    }
}
