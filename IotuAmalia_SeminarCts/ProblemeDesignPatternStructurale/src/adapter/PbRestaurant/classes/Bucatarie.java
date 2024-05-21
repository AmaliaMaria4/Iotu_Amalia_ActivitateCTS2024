package adapter.PbRestaurant.classes;

public class Bucatarie implements IBucatarie {
   private String numeBucatar;
   private int suprafata;
   private int nrAngajati;

    @Override
    public void printeazaFactura() {
        System.out.println("Aceasta este factura");
    }

    public Bucatarie(String numeBucatar, int suprafata, int nrAngajati) {
        this.numeBucatar = numeBucatar;
        this.suprafata = suprafata;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bucatarie{");
        sb.append("numeBucatar='").append(numeBucatar).append('\'');
        sb.append(", suprafata=").append(suprafata);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}
