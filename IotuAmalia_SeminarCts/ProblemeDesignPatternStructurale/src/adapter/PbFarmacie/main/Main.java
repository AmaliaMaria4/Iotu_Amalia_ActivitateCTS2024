package adapter.PbFarmacie.main;

import adapter.PbFarmacie.classes.AplicatieVanzare;

public class Main {
    public static void main(String[] args) {
        // Creăm un obiect pentru aplicația de vânzare
        AplicatieVanzare aplicatieVanzare = new AplicatieVanzare();

        // Creăm un adaptor pentru a folosi aplicația de vânzare în aplicația de gestionare a stocurilor
        // AplicatieGestiuneStoc adaptor = new AdaptorGestiune(aplicatieVanzare);

        // Utilizăm applicant de gestionare a stocurilor fără a modifica codul existent din aplicația de vânzare
//        boolean disponibil = adaptor.verificaStocPentruMedicament(123, 50);
//        System.out.println("Stoc disponibil: " + disponibil);
    }
}
