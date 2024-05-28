package template.pbFarmacie.main;

import template.pbFarmacie.classes.AchizitieFarmacie;
import template.pbFarmacie.classes.ProcesAchizitieMedicamente;

public class Main {
    public static void main(String[] args) {
        ProcesAchizitieMedicamente achizitie = new AchizitieFarmacie("Reteta123");
        achizitie.executaAchizitie();
    }
}
