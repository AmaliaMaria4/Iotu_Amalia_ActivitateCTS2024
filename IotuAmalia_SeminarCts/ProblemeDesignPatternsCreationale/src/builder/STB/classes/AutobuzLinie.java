package builder.STB.classes;

public class AutobuzLinie {
    private String modelAutobuz;
    private String numeSofer;
    private boolean areOprireLaCapat;
    private boolean deschideUsileInFiecareStatie;
    private String textEcran;
    private String numarInmatriculare;

    public AutobuzLinie(String modelAutobuz, String numeSofer, boolean areOprireLaCapat, boolean deschideUsileInFiecareStatie, String textEcran, String numarInmatriculare) {
        this.modelAutobuz = modelAutobuz;
        this.numeSofer = numeSofer;
        this.areOprireLaCapat = areOprireLaCapat;
        this.deschideUsileInFiecareStatie = deschideUsileInFiecareStatie;
        this.textEcran = textEcran;
        this.numarInmatriculare = numarInmatriculare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", areOprireLaCapat=").append(areOprireLaCapat);
        sb.append(", deschideUsileInFiecareStatie=").append(deschideUsileInFiecareStatie);
        sb.append(", textEcran='").append(textEcran).append('\'');
        sb.append(", numarInmatriculare='").append(numarInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setModelAutobuz(String modelAutobuz) {
        this.modelAutobuz = modelAutobuz;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setAreOprireLaCapat(boolean areOprireLaCapat) {
        this.areOprireLaCapat = areOprireLaCapat;
    }

    public void setDeschideUsileInFiecareStatie(boolean deschideUsileInFiecareStatie) {
        this.deschideUsileInFiecareStatie = deschideUsileInFiecareStatie;
    }

    public void setTextEcran(String textEcran) {
        this.textEcran = textEcran;
    }

    public void setNumarInmatriculare(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }
}
