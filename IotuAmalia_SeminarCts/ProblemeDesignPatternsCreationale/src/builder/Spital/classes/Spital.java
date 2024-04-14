package builder.Spital.classes;

public class Spital {
    private boolean pat_rabatabil;
    private boolean mic_dejun;
    private boolean papuci;
    private boolean halat;

    public Spital(boolean pat_rabatabil, boolean mic_dejun, boolean papuci, boolean halat) {
        this.pat_rabatabil = pat_rabatabil;
        this.mic_dejun = mic_dejun;
        this.papuci = papuci;
        this.halat = halat;
    }

    public void setPat_rabatabil(boolean pat_rabatabil) {
        this.pat_rabatabil = pat_rabatabil;
    }

    public void setMic_dejun(boolean mic_dejun) {
        this.mic_dejun = mic_dejun;
    }

    public void setPapuci(boolean papuci) {
        this.papuci = papuci;
    }

    public void setHalat(boolean halat) {
        this.halat = halat;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spital{");
        sb.append("pat_rabatabil=").append(pat_rabatabil);
        sb.append(", mic_dejun=").append(mic_dejun);
        sb.append(", papuci=").append(papuci);
        sb.append(", halat=").append(halat);
        sb.append('}');
        return sb.toString();
    }
}
