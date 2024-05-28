package chain.pbFarmacie.classes;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private int nrComanda;
    private List<String> listaMedicamente=new ArrayList<>();
private String tipComanda;

    public Comanda(int nrComanda, List<String> listaMedicamente, String tipComanda) {
        this.nrComanda = nrComanda;
        this.listaMedicamente = listaMedicamente;
        this.tipComanda = tipComanda;
    }

    public int getNrComanda() {
        return nrComanda;
    }

    public void setNrComanda(int nrComanda) {
        this.nrComanda = nrComanda;
    }

    public List<String> getListaMedicamente() {
        return listaMedicamente;
    }

    public void setListaMedicamente(List<String> listaMedicamente) {
        this.listaMedicamente = listaMedicamente;
    }

    public String getTipComanda() {
        return tipComanda;
    }

    public void setTipComanda(String tipComanda) {
        this.tipComanda = tipComanda;
    }
}
