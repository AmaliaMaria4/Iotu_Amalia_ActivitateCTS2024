package proxy.proxyPbSpital.classes;

public class Persoana {
    private String nume;
    private boolean areAsigurare;


    public Persoana(String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persoana{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
