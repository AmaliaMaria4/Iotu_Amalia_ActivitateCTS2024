package state.pbStb.classes;

public class Autobuz {
    private int nrAutobuz;
    private StareAutobuz stare;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.stare = new AutobuzLaCapatDeLinie();
    }

    public void setStare(StareAutobuz stare) {
        this.stare = stare;
    }
    public int getNrAutobuz() {
        return nrAutobuz;
    }
    public StareAutobuz getStare() {
        return stare;
    }
    public void pleacaInCursa() {
        stare.pleacaInCursa(this);
    }

    public void ajungeLaCapatDeLinie() {
        stare.ajungeLaCapatDeLinie(this);
    }

    public void reparat() {
        stare.reparat(this);
    }
}
