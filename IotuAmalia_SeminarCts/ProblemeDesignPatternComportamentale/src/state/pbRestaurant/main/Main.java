package state.pbRestaurant.main;

import state.pbRestaurant.classes.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa();

        masa.modificaStare(); // Masa este libera
        masa.modificaStare(); // Masa este rezervata
        masa.modificaStare(); // Masa este ocupata
    }
}
