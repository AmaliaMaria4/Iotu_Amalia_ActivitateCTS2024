package state.pbFarmacie.classes;

public class Reteta {
    private StareReteta stare;

    public Reteta() {
        this.stare = new Emisa();
    }

    protected void setStare(StareReteta stare) {
        this.stare = stare;
    }

    public void modificaStare() {
        stare.modificaStare(this);
    }
}
