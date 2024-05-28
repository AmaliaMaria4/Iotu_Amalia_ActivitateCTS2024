package template.pbBanca.main;

import template.pbBanca.classes.OperatiuneRetragere;
import template.pbBanca.classes.RetragereBancomat;

public class Main {
    public static void main(String[] args) {
        OperatiuneRetragere retragere = new RetragereBancomat("1234 5678 9012 3456", 1234, 200);
        retragere.executaRetragere();
    }
}
