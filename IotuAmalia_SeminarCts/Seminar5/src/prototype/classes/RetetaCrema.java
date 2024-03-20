package prototype.classes;

public class RetetaCrema implements RetetaAbstracta{
    private String nume;
    private int cantitate;

    public RetetaCrema(String nume, int cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "RetetaCrema{" +
                "nume='" + nume + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }

    public RetetaCrema() {
        this.nume="";
        this.cantitate=0;
    }

    @Override
    public RetetaAbstracta clone() {
        RetetaCrema retetaCrema=new RetetaCrema();
        retetaCrema.setCantitate(this.cantitate);
        retetaCrema.setNume(this.nume);
        return retetaCrema;
    }
}
