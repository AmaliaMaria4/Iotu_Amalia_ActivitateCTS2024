package memento.pbSportiv.classes;

import java.util.List;

public class Meci {
    private String dataMeci;
    private List<String> listaEchipe;
    private int nrBilete;
    private int nrSpectatoti;
    private int nrSticleApa;
    private int nrJandarmi;
    private int nrStewarzi;

    public Meci(String dataMeci, List<String> listaEchipe, int nrBilete, int nrSpectatoti,
                int nrSticleApa, int nrJandarmi, int nrStewarzi) {
        this.dataMeci = dataMeci;
        this.listaEchipe = listaEchipe;
        this.nrBilete = nrBilete;
        this.nrSpectatoti = nrSpectatoti;
        this.nrSticleApa = nrSticleApa;
        this.nrJandarmi = nrJandarmi;
        this.nrStewarzi = nrStewarzi;
    }

    public String getDataMeci() {
        return dataMeci;
    }

    public void setDataMeci(String dataMeci) {
        this.dataMeci = dataMeci;
    }

    public List<String> getListaEchipe() {
        return listaEchipe;
    }

    public void setListaEchipe(List<String> listaEchipe) {
        this.listaEchipe = listaEchipe;
    }

    public int getNrSpectatoti() {
        return nrSpectatoti;
    }

    public void setNrSpectatoti(int nrSpectatoti) {
        this.nrSpectatoti = nrSpectatoti;
    }

    public MementoMeci salvareMemento(){
        return new MementoMeci(this.dataMeci,this.listaEchipe,this.nrSpectatoti);
    }

    public void undoMemento(MementoMeci mementoMeci){
        this.dataMeci=mementoMeci.getDataMeci();
        this.listaEchipe=mementoMeci.getListaEchipe();
        this.nrSpectatoti=mementoMeci.getNrSpectatoti();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meci{");
        sb.append("dataMeci='").append(dataMeci).append('\'');
        sb.append(", listaEchipe=").append(listaEchipe);
        sb.append(", nrBilete=").append(nrBilete);
        sb.append(", nrSpectatoti=").append(nrSpectatoti);
        sb.append(", nrSticleApa=").append(nrSticleApa);
        sb.append(", nrJandarmi=").append(nrJandarmi);
        sb.append(", nrStewarzi=").append(nrStewarzi);
        sb.append('}');
        return sb.toString();
    }
}
