package template.pbSportiv.main;

import template.pbSportiv.classes.ISpectator;
import template.pbSportiv.classes.Spectator;

public class Main {
    public static void main(String[] args) {
        ISpectator spectator1=new Spectator("Alex",23);
        spectator1.intraInStadion();
    }
}
