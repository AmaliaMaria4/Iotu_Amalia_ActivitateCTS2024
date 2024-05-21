package adapter.PbStb.classes;

public class Companie implements ICompanieDeTransport{
    private String numeCompanie;
    private int anInfiintare;
    private int nrAngajati;

    public Companie(String numeCompanie, int anInfiintare, int nrAngajati) {
        this.numeCompanie = numeCompanie;
        this.anInfiintare = anInfiintare;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Companie{");
        sb.append("numeCompanie='").append(numeCompanie).append('\'');
        sb.append(", anInfiintare=").append(anInfiintare);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void cumparaBilet() {
        System.out.println("Biletul a fost cumparat!");
    }
}
