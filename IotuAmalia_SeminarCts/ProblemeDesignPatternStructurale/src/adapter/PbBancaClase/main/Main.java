package adapter.PbBancaClase.main;

import adapter.PbBancaClase.classes.AdaptorCreditClase;
import adapter.PbBancaClase.classes.CreditAbstract;


//avantaj adapter clase; nu am obiect
//daca interfata creditAbstract nu e interfata si este cls abstracta, nu pot sa fac mostenire multipla, nu pot sa mostenesc ambele clase si fac adapter de obiecte
public class Main {
    //fac o alta functie care lucreaza cu interfata
    public static void afiseazaInfoCredit(CreditAbstract credit) {
        credit.oferaCredit(); //metoda din interfata
    }
    public static void main(String[] args) {
        AdaptorCreditClase adaptorCreditClase=new AdaptorCreditClase(50,"Ana");
        afiseazaInfoCredit(adaptorCreditClase);
    }
}
