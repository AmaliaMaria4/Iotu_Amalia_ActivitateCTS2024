package adapter.PbStb.classes;

import java.util.ArrayList;
import java.util.List;

public class Metrou implements IMetrou{
    private String numeVatman;
    private List<String> numeStatii=new ArrayList<>();
    private int nrLinie;

    public Metrou(String numeVatman, List<String> numeStatii, int nrLinie) {
        this.numeVatman = numeVatman;
        this.numeStatii = numeStatii;
        this.nrLinie = nrLinie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Metrou{");
        sb.append("numeVatman='").append(numeVatman).append('\'');
        sb.append(", numeStatii=").append(numeStatii);
        sb.append(", nrLinie=").append(nrLinie);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void valideazaBilet() {
        System.out.println("Biletul a fost validat!");
    }
}
