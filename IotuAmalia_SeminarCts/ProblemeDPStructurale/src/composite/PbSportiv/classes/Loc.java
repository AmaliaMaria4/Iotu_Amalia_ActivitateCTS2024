package composite.PbSportiv.classes;

public class Loc implements ILocSpectator{
    private String numar;

    public Loc(String numar) {
        this.numar = numar;
    }

    @Override
    public void adaugaLoc(ILocSpectator locSpectator) {
        // Nu se adaugă locuri la un loc individual
        System.out.println("Nu se pot adăuga locuri la un loc individual.");
    }

    @Override
    public void stergeLoc(ILocSpectator locSpectator) {
        // Nu se șterg locuri de la un loc individual
        System.out.println("Nu se pot șterge locuri de la un loc individual.");
    }

    @Override
    public void descriere() {
        System.out.println("Loc: " + numar);
    }
}
