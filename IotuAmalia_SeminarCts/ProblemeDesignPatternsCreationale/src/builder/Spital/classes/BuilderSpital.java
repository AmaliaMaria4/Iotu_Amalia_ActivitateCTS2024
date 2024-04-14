package builder.Spital.classes;

public class BuilderSpital implements Builder {
    public Spital spital;

    public BuilderSpital() {
        this.spital = new Spital(false, false, false, false);
    }

    @Override
    public Spital spitalBuild() {
        return spital;
    }

    public BuilderSpital setPat_rabatabil(boolean pat_rabatabil) {
        spital.setPat_rabatabil(pat_rabatabil);
        return this;
    }

    public BuilderSpital setMic_dejun(boolean mic_dejun) {
        spital.setMic_dejun(mic_dejun);
        return this;
    }

    public BuilderSpital setPapuci(boolean papuci) {
        spital.setPapuci(papuci);
        return this;
    }

    public BuilderSpital setHalat(boolean halat) {
        spital.setHalat(halat);
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BuilderSpital{");
        sb.append("spital=").append(spital);
        sb.append('}');
        return sb.toString();
    }
}
