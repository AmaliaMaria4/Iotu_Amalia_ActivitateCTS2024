package chain.pbBanca.main;

import chain.pbBanca.classes.Cont;
import chain.pbBanca.classes.ContCredit;
import chain.pbBanca.classes.ContCurent;
import chain.pbBanca.classes.ContEconomii;

public class Main {
    public static void main(String[] args) {
        Cont contEconomii=new ContEconomii(100);
        Cont contCurent=new ContCurent(400);
        Cont contCredit=new ContCredit(300);

        contCurent.setSuccesor(contEconomii);
        contEconomii.setSuccesor(contCredit);

        contCurent.plateste(50);
        contCurent.plateste(340);
        contCurent.plateste(50);
        contCurent.plateste(200);
        contCurent.plateste(150);

    }
}
