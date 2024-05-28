package strategy.pbSpital.main;

import strategy.pbSpital.classes.Pacient;
import strategy.pbSpital.classes.PlataCash;
import strategy.pbSpital.classes.PlataCuCard;

public class Main {
    public static void main(String[] args) {
        // Creăm un pacient
        Pacient pacient = new Pacient("John Doe");

        // Pacientul decide să plătească cu cardul
        pacient.setMetodaPlata(new PlataCuCard());
        pacient.efectueazaPlata(100);

        // Pacientul decide să plătească cash
        pacient.setMetodaPlata(new PlataCash());
        pacient.efectueazaPlata(50);
    }
}
