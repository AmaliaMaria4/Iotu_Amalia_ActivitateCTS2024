package builder.STB.classes;

public class AutobuzLinieBuilder implements IBuilder{

    private AutobuzLinie autobuzLinie;

    public AutobuzLinieBuilder() {
        autobuzLinie=new AutobuzLinie(" "," ",false,false," "," ");
    }

    public AutobuzLinieBuilder setModelAutobuz(String modelAutobuz) {
        autobuzLinie.setModelAutobuz(modelAutobuz);
        return this;
    }
    public AutobuzLinieBuilder setNumeSofer(String numeSofer) {
        autobuzLinie.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzLinieBuilder setAreOprireLaCapat(boolean areOprireLaCapat) {
        autobuzLinie.setAreOprireLaCapat(areOprireLaCapat);
        return this;
    }

    public AutobuzLinieBuilder setDeschideUsileInFiecareStatie(boolean deschideUsileInFiecareStatie) {
        autobuzLinie.setDeschideUsileInFiecareStatie(deschideUsileInFiecareStatie);
        return this;
    }

    public AutobuzLinieBuilder setTextEcran(String textEcran) {
        autobuzLinie.setTextEcran(textEcran);
        return this;
    }

    public AutobuzLinieBuilder setNumarInmatriculare(String numarInmatriculare) {
        autobuzLinie.setNumarInmatriculare(numarInmatriculare);
        return this;
    }
    @Override
    public AutobuzLinie build() {
        return autobuzLinie;
    }
}
