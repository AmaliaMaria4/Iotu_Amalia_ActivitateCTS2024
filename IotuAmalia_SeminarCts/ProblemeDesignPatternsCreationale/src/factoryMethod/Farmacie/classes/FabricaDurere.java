package factoryMethod.Farmacie.classes;

public class FabricaDurere implements IFabricaFarmacie{
    @Override
    public Medicamente createObject(String denumire, int pret) {
        return new Durere(denumire,pret);
    }
}
