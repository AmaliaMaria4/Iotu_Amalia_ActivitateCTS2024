package simpleFactory.Banca.classes;

public class CreditNevoiPersonale extends Credit {
    public CreditNevoiPersonale(float suma, float dobanda) {
        super(suma, dobanda);
    }

    @Override
    public void afisareCredit() {
            System.out.println("Creditul de Nevoi Personale a fost acceptat");
    }
}

