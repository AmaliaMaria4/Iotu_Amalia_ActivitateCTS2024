package command.pbBanca.classes;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Comanda> comenzi;

    public Manager() {
        this.comenzi = new ArrayList<Comanda>();
    }
    public void invoca(Comanda comanda){
        comenzi.add(comanda);
    }
    public void executaComanda(){
        if(!comenzi.isEmpty()){
            comenzi.get(0).executa();
            comenzi.remove(0);
        }
    }
}
