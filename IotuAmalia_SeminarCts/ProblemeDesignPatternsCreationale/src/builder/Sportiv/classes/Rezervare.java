package builder.Sportiv.classes;

public class Rezervare {
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoareInclusa;
    private String muzicaAmbientalaPersonalizata;

    public Rezervare() {
        this.mancareInclusa = false;
        this.scaunErgonomic = false;
        this.bauturaRacoritoareInclusa = false;
        this.muzicaAmbientalaPersonalizata = "";
    }

    public void setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public void setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
        this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
    }

    public void setMuzicaAmbientalaPersonalizata(String muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("mancareInclusa=").append(mancareInclusa);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", bauturaRacoritoareInclusa=").append(bauturaRacoritoareInclusa);
        sb.append(", muzicaAmbientalaPersonalizata='").append(muzicaAmbientalaPersonalizata).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
