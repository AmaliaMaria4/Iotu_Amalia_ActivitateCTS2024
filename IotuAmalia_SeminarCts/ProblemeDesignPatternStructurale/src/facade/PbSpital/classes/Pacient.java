package facade.PbSpital.classes;

public class Pacient {
    private String nume;
    private String stare;

    public Pacient(String nume, String stare) {
        this.nume = nume;
        this.stare = stare;
    }

    public String getNume() {
        return nume;
    }

    public String getStare() {
        return stare;
    }

    public boolean esteInStareGrava() {
        // Verificarea gravității stării pacientului
        // Returnează true dacă starea este gravă, altfel false
        return stare.equals("grava");
    }
}
