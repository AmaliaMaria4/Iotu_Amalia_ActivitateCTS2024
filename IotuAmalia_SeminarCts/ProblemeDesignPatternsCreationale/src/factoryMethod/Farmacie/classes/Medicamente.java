package factoryMethod.Farmacie.classes;

public abstract class Medicamente {
    private String denumire;
    private int pret;

    public Medicamente(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicamente{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
