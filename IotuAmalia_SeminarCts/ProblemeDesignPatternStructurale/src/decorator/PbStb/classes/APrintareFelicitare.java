package decorator.PbStb.classes;

public abstract class APrintareFelicitare implements IBilet{
    private IBilet bilet;

    public APrintareFelicitare(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printareBilet() {
        bilet.printareBilet();
    }
    public abstract void printareMesaj();
}
