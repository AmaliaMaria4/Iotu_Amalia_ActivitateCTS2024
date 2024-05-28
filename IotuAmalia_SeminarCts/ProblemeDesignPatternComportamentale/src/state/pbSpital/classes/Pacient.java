package state.pbSpital.classes;

public class Pacient {
    private String nume;
    private StarePacient stare;

    public Pacient(String nume) {
        this.nume = nume;
        this.stare = new Internat(); // La început, pacientul este internat
    }

    protected void setStare(StarePacient stare) {
        this.stare = stare;
    }

    public StarePacient getStare() {
        return stare;
    }

    public void adusInSpital() {
        stare.modificaStare(this);
    }

    public void stareGrava() {
        stare.modificaStare(this);
    }

    public void externat() {
        stare.modificaStare(this);
    }

    public String getNume() {
        return nume;
    }
    //internat
    //sub observatie
    //externat
}
