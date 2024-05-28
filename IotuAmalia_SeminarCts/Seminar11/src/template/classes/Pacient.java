package template.classes;

public class Pacient {
    private String nume;
    //stare sanatate;
    private int stareSanatate;

    public Pacient(String nume, int stareSanatate) {
        this.nume = nume;
        this.stareSanatate = stareSanatate;
    }

    public String getNume() {
        return nume;
    }

    public int getStareSanatate() {
        return stareSanatate;
    }

    public void setStareSanatate(int stareSanatate) {
        this.stareSanatate = stareSanatate;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", stareSanatate=").append(stareSanatate);
        sb.append('}');
        return sb.toString();
    }
}
