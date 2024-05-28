package state.pbBanca.main;

import state.pbBanca.classes.AreCard;
import state.pbBanca.classes.ArePinIntrodus;
import state.pbBanca.classes.Bancomat;

public class Main {
    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat(1000); // Bancomatul are 1000 lei

        bancomat.retragereBani(); // Se va afișa "Introduceți un card valid."
        bancomat.schimbaStare(new AreCard(bancomat)); // Se introduce cardul
        bancomat.retragereBani(); // Se va afișa "Introduceți PIN-ul."
        bancomat.schimbaStare(new ArePinIntrodus(bancomat)); // Se introduce PIN-ul
        bancomat.setSuma(500); // Se stabilește suma disponibilă în bancomat
        bancomat.retragereBani(); // Se va afișa "Se retrag 500 lei."
        bancomat.retragereBani(); // Se va afișa "Nu mai sunt bani în bancomat."
    }
}
