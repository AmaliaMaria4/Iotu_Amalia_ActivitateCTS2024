package strategy.pbSportiv.main;

import strategy.pbSportiv.classes.Spectator;
import strategy.pbSportiv.classes.VerificarePeluza;
import strategy.pbSportiv.classes.VerificareTribuna;
import strategy.pbSportiv.classes.VerificareVip;

public class Main {
    public static void main(String[] args) {
        Spectator spectatorVIP = new Spectator("VIP", new VerificareVip(), false, true, false);
        Spectator spectatorTribuna = new Spectator("Tribuna", new VerificareTribuna(), true, false, false);
        Spectator spectatorPeluza = new Spectator("Peluza", new VerificarePeluza(), true, true, true);

        spectatorVIP.intrareStadion();
        spectatorTribuna.intrareStadion();
        spectatorPeluza.intrareStadion();
    }
}
