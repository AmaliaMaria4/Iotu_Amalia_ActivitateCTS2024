package command.pbRestaurant.classes;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Comanda> comezi;

    public Operator() {
        this.comezi = new ArrayList<Comanda>();
    }

    public void invoca(Comanda comanda) {
        this.comezi.add(comanda);
    }

    public void executaComanda() {
        comezi.get(0).executa();
        comezi.remove(0);
    }
}
