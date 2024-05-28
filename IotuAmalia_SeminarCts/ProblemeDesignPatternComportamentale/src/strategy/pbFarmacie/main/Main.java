package strategy.pbFarmacie.main;

import strategy.pbFarmacie.classes.Client;
import strategy.pbFarmacie.classes.PlataCash;
import strategy.pbFarmacie.classes.PlataCuCard;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("John");

        // Clientul decide să plătească cu cardul
        client.setMetodaPlata(new PlataCuCard());
        client.efectueazaPlata(100);

        // Clientul decide să plătească cash
        client.setMetodaPlata(new PlataCash());
        client.efectueazaPlata(50);
    }
}
