package strategy.pbRestaurant.main;

import strategy.pbRestaurant.classes.ClientRestaurant;
import strategy.pbRestaurant.classes.PlataCash;
import strategy.pbRestaurant.classes.PlataCuCard;

public class Main {
    public static void main(String[] args) {
//        ClientRestaurant client = new ClientRestaurant("John");
//
//        // Clientul decide să plătească cu cardul
//        client.setMetodaPlata(new PlataCuCard());
//        client.efectueazaPlata(100);
//
//        // Clientul decide să plătească cash
//        client.setMetodaPlata(new PlataCash());
//        client.efectueazaPlata(50);

        PlataCash plataCash=new PlataCash(300);
        ClientRestaurant clientRestaurant1=new ClientRestaurant(plataCash,"Alin");

        clientRestaurant1.efectueazaPlata(200);
        clientRestaurant1.setMetodaPlata(new PlataCuCard());
        clientRestaurant1.efectueazaPlata(110);
        clientRestaurant1.setMetodaPlata(plataCash);

        clientRestaurant1.efectueazaPlata(200);
    }
}
