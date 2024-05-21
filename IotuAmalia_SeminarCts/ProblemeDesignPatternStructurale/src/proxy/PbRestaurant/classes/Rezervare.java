package proxy.PbRestaurant.classes;

public class Rezervare implements IRezervareMasa{
   private int nrPersoane;
   private String numeClient;

    public Rezervare(int nrPersoane, String numeClient) {
        this.nrPersoane = nrPersoane;
        this.numeClient = numeClient;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrPersoane=").append(nrPersoane);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {
        System.out.println(this.numeClient+"a rezervat o masa pentru "+ this.getNrPersoane());
    }

    @Override
    public void rezervaMasa() {
        System.out.println("Masa a fost rezervata");
    }
}
