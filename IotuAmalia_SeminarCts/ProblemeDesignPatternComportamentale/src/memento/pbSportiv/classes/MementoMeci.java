package memento.pbSportiv.classes;

import java.util.List;

public class MementoMeci {
    private String dataMeci;
    private List<String> listaEchipe;
    private int nrSpectatoti;

    public MementoMeci(String dataMeci, List<String> listaEchipe, int nrSpectatoti) {
        this.dataMeci = dataMeci;
        this.listaEchipe = listaEchipe;
        this.nrSpectatoti = nrSpectatoti;
    }

    public String getDataMeci() {
        return dataMeci;
    }

    public List<String> getListaEchipe() {
        return listaEchipe;
    }

    public int getNrSpectatoti() {
        return nrSpectatoti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MementoMeci{");
        sb.append("dataMeci='").append(dataMeci).append('\'');
        sb.append(", listaEchipe=").append(listaEchipe);
        sb.append(", nrSpectatoti=").append(nrSpectatoti);
        sb.append('}');
        return sb.toString();
    }
}
