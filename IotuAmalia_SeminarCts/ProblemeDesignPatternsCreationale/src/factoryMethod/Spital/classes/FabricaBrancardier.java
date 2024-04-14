package factoryMethod.Spital.classes;

public class FabricaBrancardier implements IFabricaSpital{
    @Override
    public IPersonalSpital creareAngajat() {
        return new Brancardier();
    }
}
