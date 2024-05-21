package decorator.PbStb.classes;

public class Bilet implements IBilet{
    private String linie;
    private int pret;

    public Bilet(String linie, int pret) {
        this.linie = linie;
        this.pret = pret;
    }

    @Override
    public void printareBilet() {
        System.out.println("S a printat biletul pe linia "+this.linie);
    }
}
