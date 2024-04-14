package builder.Sportiv.main;

import builder.Sportiv.classes.Rezervare;
import builder.Sportiv.classes.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new RezervareBuilder()
                .setMancareInclusa(true)
                .setBauturaRacoritoareInclusa(true)
                .setMuzicaAmbientalaPersonalizata("muzica")
                .setScaunErgonomic(true)
                .buildRezervare();
        System.out.println(rezervare);
    }
}
