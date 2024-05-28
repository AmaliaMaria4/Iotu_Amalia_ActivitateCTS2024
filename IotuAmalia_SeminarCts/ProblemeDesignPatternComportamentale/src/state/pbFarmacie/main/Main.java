package state.pbFarmacie.main;

import state.pbFarmacie.classes.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta();

        reteta.modificaStare(); // Emite reteta
        reteta.modificaStare(); // Solicita reteta la farmacie
        reteta.modificaStare(); // Achizitioneaza medicamentele
    }
}
