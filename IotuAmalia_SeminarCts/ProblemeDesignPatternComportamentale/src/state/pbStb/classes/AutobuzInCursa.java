package state.pbStb.classes;

public class AutobuzInCursa implements StareAutobuz {
    @Override
    public void pleacaInCursa(Autobuz autobuz) {
        System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " este deja în cursă.");
    }

    @Override
    public void ajungeLaCapatDeLinie(Autobuz autobuz) {
        autobuz.setStare(new AutobuzLaCapatDeLinie());
        System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " a ajuns la capăt de linie.");
    }

    @Override
    public void reparat(Autobuz autobuz) {
        System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu poate fi reparat în timp ce este în cursă.");
    }
}