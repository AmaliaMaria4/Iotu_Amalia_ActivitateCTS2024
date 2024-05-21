package adapter.PbBancaObiecte.main;

import adapter.PbBancaObiecte.classes.AdapterCreditObiecte;
import adapter.PbBancaObiecte.classes.CreditAbstract;
import adapter.PbBancaObiecte.classes.Leasing;

public class Main {
    //fac o alta functie care lucreaza cu interfata
    public static void afiseazaInfoCredit(CreditAbstract credit, float suma) {
        credit.oferaCredit(suma); //metoda din interfata
    }

    public static void main(String[] args) {
        Leasing leasing = new Leasing(100, "Ion");
        //afiseazaInfoCredit(leasing,leasing.getSuma()); //nu merge si de asta fac adapter

        AdapterCreditObiecte adapterCreditObiecte = new AdapterCreditObiecte(leasing);
        afiseazaInfoCredit(adapterCreditObiecte, leasing.getSuma());
    }
}
