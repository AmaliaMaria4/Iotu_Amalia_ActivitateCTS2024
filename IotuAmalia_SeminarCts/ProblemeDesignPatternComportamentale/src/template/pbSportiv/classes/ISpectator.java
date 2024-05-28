package template.pbSportiv.classes;

public abstract class ISpectator {
    protected String nume;
    protected int varsta;
    //protected ca sa nu mai fac getter
    public abstract void aseazaLaCoada();
    public abstract void prezintaBilet();
    public abstract void controlCorporal();
    public abstract void  intra();
    public abstract void ocupaLoc();

    //pasi bine definiti
    public final void intraInStadion(){
        aseazaLaCoada();
        prezintaBilet();
        controlCorporal();
        intra();
        ocupaLoc();
    }

    public ISpectator(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
}
