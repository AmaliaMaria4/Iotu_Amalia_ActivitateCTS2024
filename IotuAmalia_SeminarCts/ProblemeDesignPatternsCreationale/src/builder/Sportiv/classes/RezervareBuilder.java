package builder.Sportiv.classes;

public class RezervareBuilder implements IRezervare {

    private Rezervare rezervare;

    public RezervareBuilder() {
        this.rezervare = new Rezervare();
    }

    @Override
    public Rezervare buildRezervare() {
        return rezervare;
    }

    public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
        rezervare.setMancareInclusa(mancareInclusa);
        return this;
    }

    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
        rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    public RezervareBuilder setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
        rezervare.setBauturaRacoritoareInclusa(bauturaRacoritoareInclusa);
        return this;
    }

    public RezervareBuilder setMuzicaAmbientalaPersonalizata(String muzicaAmbientalaPersonalizata) {
        rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
        return this;
    }


}
