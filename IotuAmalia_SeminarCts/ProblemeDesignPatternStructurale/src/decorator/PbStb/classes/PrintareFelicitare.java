package decorator.PbStb.classes;

public class PrintareFelicitare extends APrintareFelicitare{
    public PrintareFelicitare(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printareMesaj() {
        System.out.println("La multi ani!");
    }
}
