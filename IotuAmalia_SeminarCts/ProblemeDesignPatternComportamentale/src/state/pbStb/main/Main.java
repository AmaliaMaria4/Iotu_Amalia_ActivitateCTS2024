package state.pbStb.main;

import state.pbStb.classes.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(1);

        autobuz.pleacaInCursa();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.pleacaInCursa();
        autobuz.reparat();
    }
}