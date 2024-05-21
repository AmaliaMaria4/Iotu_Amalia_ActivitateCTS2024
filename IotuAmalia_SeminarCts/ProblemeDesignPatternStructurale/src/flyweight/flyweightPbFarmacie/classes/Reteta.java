package flyweight.flyweightPbFarmacie.classes;

public class Reteta {
    private int nrReteta;
    private float sumaPlata;
    private int nrMedicamente;

    public Reteta(int nrReteta, float sumaPlata, int nrMedicamente) {
        this.nrReteta = nrReteta;
        this.sumaPlata = sumaPlata;
        this.nrMedicamente = nrMedicamente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("nrReteta=").append(nrReteta);
        sb.append(", sumaPlata=").append(sumaPlata);
        sb.append(", nrMedicamente=").append(nrMedicamente);
        sb.append('}');
        return sb.toString();
    }
}
