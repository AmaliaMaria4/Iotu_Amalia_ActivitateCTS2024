package composite.PbStb.classes;

public class AutobuzFrunza implements IComponenta{
    private String descriere;

    public AutobuzFrunza(String descriere) {
        this.descriere = descriere;
    }

    @Override
    public void adaugaComponenta(IComponenta comp) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeComponenta(IComponenta comp) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void getComponenta(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void desceriere(String identare) {
        System.out.println(identare+"Autobuzul frunza "+this.descriere);
    }
}
