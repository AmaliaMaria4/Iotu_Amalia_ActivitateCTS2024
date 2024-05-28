package state.pbStb.classes;

public class AutobuzLaReparat implements StareAutobuz {
    @Override
    public void pleacaInCursa(Autobuz autobuz) {
        System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu poate pleca în cursă în timp ce este la reparații.");
    }

    @Override
    public void ajungeLaCapatDeLinie(Autobuz autobuz) {
        System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu poate ajunge la capăt de linie în timp ce este la reparații.");
    }

    @Override
    public void reparat(Autobuz autobuz) {
        autobuz.setStare(new AutobuzLaCapatDeLinie());
        System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " a fost reparat și poate pleca în cursă.");
    }
}