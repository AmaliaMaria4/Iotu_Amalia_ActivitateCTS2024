package strategy.pbFarmacie.classes;

public class Client {
    private String nume;
    private IMetodaPlata metodaPlata;

    public Client(String nume) {
        this.nume = nume;
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void efectueazaPlata(double suma) {
        if (metodaPlata == null) {
            System.out.println("Nu a fost setată nicio metodă de plată.");
            return;
        }
        metodaPlata.plateste(suma);
    }
}
