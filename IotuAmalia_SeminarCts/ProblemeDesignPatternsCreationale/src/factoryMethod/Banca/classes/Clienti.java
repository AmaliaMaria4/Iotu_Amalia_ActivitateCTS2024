package factoryMethod.Banca.classes;

public abstract class Clienti {
    private String nume;
    private String nrTelefon;
    private long cnp;

    public Clienti(String nume, String nrTelefon, long cnp) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clienti{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon=").append(nrTelefon);
        sb.append(", cnp=").append(cnp);
        sb.append('}');
        return sb.toString();
    }
}
