package adapter.PbBancaObiecte.classes;

public class AdapterCreditObiecte implements CreditAbstract{
    private Leasing leasing;

    public AdapterCreditObiecte(Leasing leasing) {
        this.leasing = leasing;
    }

    @Override
    public void oferaCredit(float suma) {
        leasing.imprumuta();
    }
}
