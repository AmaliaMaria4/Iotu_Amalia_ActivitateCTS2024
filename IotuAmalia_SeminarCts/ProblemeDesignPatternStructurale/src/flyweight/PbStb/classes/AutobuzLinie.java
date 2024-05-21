package flyweight.PbStb.classes;

public class AutobuzLinie {
    private String modelAutobuz;
    private int anfabricatie;
    private int nrLocuri;


    public AutobuzLinie(String modelAutobuz, int anfabricatie, int nrLocuri) {
        this.modelAutobuz = modelAutobuz;
        this.anfabricatie = anfabricatie;
        this.nrLocuri = nrLocuri;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", anfabricatie=").append(anfabricatie);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
