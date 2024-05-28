package chain.pbFarmacie.classes;

public abstract class AngajatFarmacie {
    protected AngajatFarmacie angajatFarmacie;

    public AngajatFarmacie getAngajatFarmacie() {
        return angajatFarmacie;
    }

    public void setAngajatFarmacie(AngajatFarmacie angajatFarmacie) {
        this.angajatFarmacie = angajatFarmacie;
    }

    public abstract void proceseazaComanda(Comanda comanda);
}
