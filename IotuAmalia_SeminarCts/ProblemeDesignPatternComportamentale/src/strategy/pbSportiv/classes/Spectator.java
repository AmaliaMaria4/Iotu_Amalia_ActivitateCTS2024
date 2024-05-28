package strategy.pbSportiv.classes;

public class Spectator {
    private String nume;
    private IVerificare modVerificare;
    private boolean areBagaje;
    private boolean areBilet;
    private boolean areHaine;

    public Spectator(String nume, IVerificare modVerificare, boolean areBagaje, boolean areBilet, boolean areHaine) {
        this.nume = nume;
        this.modVerificare = modVerificare;
        this.areBagaje = areBagaje;
        this.areBilet = areBilet;
        this.areHaine = areHaine;
    }

    public void setModVerificare(IVerificare modVerificare) {
        this.modVerificare = modVerificare;
    }

    public void intrareStadion() {
        System.out.println("Spectatorul " + nume + " a ajuns la poarta stadionului.");
        modVerificare.verifica(this);
    }

    public String getNume() {
        return nume;
    }

    public boolean areBagaje() {
        return areBagaje;
    }

    public boolean areBilet() {
        return areBilet;
    }

    public boolean areHaine() {
        return areHaine;
    }
}
