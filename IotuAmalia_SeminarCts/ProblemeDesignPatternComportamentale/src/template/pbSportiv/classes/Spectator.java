package template.pbSportiv.classes;

public class Spectator extends ISpectator{

    public Spectator(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void aseazaLaCoada() {
        System.out.println("Spectatorul: "+nume+" s a asezat la coada");
    }

    @Override
    public void prezintaBilet() {
        System.out.println("Spectatorul: "+nume+" a prezentat biletul");

    }

    @Override
    public void controlCorporal() {
        System.out.println("Spectatorul: "+nume+" a fost controlat");

    }
    @Override
    public void intra() {
        System.out.println("Spectatorul: "+nume+" a intrat");

    }
    @Override
    public void ocupaLoc() {
        System.out.println("Spectatorul: "+nume+" si a ocupat locul");

    }
}
