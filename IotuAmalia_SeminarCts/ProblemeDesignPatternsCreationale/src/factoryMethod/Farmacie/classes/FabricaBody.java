package factoryMethod.Farmacie.classes;

public class FabricaBody implements IFabricaFarmacie{
    @Override
    public Medicamente createObject(String denumire, int pret) {
        return new Body(denumire, pret);
    }
}
