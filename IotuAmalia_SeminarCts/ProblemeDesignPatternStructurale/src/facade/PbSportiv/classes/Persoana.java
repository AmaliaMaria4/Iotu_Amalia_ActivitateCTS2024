package facade.PbSportiv.classes;

public class Persoana {
    private String serieBuletin;
    private String codBilet;

    public Persoana(String serieBuletin, String codBilet) {
        this.serieBuletin = serieBuletin;
        this.codBilet = codBilet;
    }

    public String getSerieBuletin() {
        return serieBuletin;
    }

    public String getCodBilet() {
        return codBilet;
    }
}
