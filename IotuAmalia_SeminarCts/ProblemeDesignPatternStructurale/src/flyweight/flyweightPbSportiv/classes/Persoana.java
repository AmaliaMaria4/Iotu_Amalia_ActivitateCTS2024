package flyweight.flyweightPbSportiv.classes;

public class Persoana implements Flyweight {
    private int inaltime;
    private int latime;
    private String pozitie;
    private String culoareTricou;

    public Persoana(int inaltime, int latime, String pozitie, String culoareTricou) {
        this.inaltime = inaltime;
        this.latime = latime;
        this.pozitie = pozitie;
        this.culoareTricou = culoareTricou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persoana{");
        sb.append("inaltime=").append(inaltime);
        sb.append(", latime=").append(latime);
        sb.append(", pozitie='").append(pozitie).append('\'');
        sb.append(", culoareTricou='").append(culoareTricou).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void deseneazaPersoana(int inaltime, int latime, String pozitie, String culoareTricou) {
        // Desenați persoana în tribună folosind informațiile furnizate
        System.out.println("Desenare persoana: Inaltime: " + inaltime + ", Latime: " + latime +
                ", Pozitie: " + pozitie + ", Culoare tricou: " + culoareTricou);
    }
}