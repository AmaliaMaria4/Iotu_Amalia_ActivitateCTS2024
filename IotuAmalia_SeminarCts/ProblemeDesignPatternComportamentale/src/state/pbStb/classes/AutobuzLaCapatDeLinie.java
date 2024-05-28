package state.pbStb.classes;

public class AutobuzLaCapatDeLinie implements StareAutobuz {
    @Override
    public void pleacaInCursa(Autobuz autobuz) {
        autobuz.setStare(new AutobuzInCursa());
        System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " pleacă în cursă.");
    }

    @Override
    public void ajungeLaCapatDeLinie(Autobuz autobuz) {
        System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " este deja la capăt de linie.");
    }

    @Override
    public void reparat(Autobuz autobuz) {
        System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu poate fi reparat în timp ce este la capăt de linie.");
    }
}