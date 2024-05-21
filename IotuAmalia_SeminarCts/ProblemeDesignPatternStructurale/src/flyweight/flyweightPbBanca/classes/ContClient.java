package flyweight.flyweightPbBanca.classes;

public class ContClient {
    private int nrCont;
    private float sumaCont;

    public ContClient(int nrCont, float sumaCont) {
        this.nrCont = nrCont;
        this.sumaCont = sumaCont;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContClient{");
        sb.append("nrCont=").append(nrCont);
        sb.append(", sumaCont=").append(sumaCont);
        sb.append('}');
        return sb.toString();
    }
}
