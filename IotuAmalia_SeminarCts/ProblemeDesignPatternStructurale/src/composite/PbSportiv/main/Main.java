package composite.PbSportiv.main;

import composite.PbSportiv.classes.ILocSpectator;
import composite.PbSportiv.classes.Loc;
import composite.PbSportiv.classes.Sectiune;

public class Main {
    public static void main(String[] args) {
        ILocSpectator tribuna = new Sectiune("Tribuna");
        ILocSpectator tribunaNord = new Sectiune("Tribuna Nord");
        ILocSpectator tribunaSud = new Sectiune("Tribuna Sud");
        ILocSpectator tribunaVIP = new Sectiune("Tribuna VIP");
        ILocSpectator loc1 = new Loc("1");
        ILocSpectator loc2 = new Loc("2");
        ILocSpectator loc3 = new Loc("3");

        tribuna.adaugaLoc(tribunaNord);
        tribuna.adaugaLoc(tribunaSud);
        tribuna.adaugaLoc(tribunaVIP);

        tribunaNord.adaugaLoc(loc1);
        tribunaNord.adaugaLoc(loc2);
        tribunaSud.adaugaLoc(loc3);
tribunaNord.stergeLoc(loc1);
tribunaSud.adaugaLoc(loc1);
        tribuna.descriere();
    }
}
