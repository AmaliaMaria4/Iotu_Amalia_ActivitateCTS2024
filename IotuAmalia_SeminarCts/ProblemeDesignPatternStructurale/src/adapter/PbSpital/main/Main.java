package adapter.PbSpital.main;

import adapter.PbSpital.classes.AdapterFarmacie;
import adapter.PbSpital.classes.Farmacie;
import adapter.PbSpital.classes.MedicamentSpital;
import adapter.PbSpital.classes.Spital;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ce metoda statica trebuia sa fac aici?
        MedicamentSpital spital = new Spital("Spitalul X");

        // adaptorul
        MedicamentSpital adaptorFarmacie = new AdapterFarmacie(new Farmacie("Farmacia Y", "Paracetamol", new ArrayList<>()));

        System.out.println("--- Achiziționare medicament din spital ---");
        spital.achizitioneazaMedicament();
        spital.prezintaReteta();

        System.out.println("--- Achiziționare medicament din farmacie ---");
        adaptorFarmacie.achizitioneazaMedicament();
        adaptorFarmacie.prezintaReteta();
    }
}
