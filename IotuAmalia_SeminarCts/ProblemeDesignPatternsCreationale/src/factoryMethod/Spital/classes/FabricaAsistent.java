package factoryMethod.Spital.classes;

public class FabricaAsistent implements IFabricaSpital{
    @Override
    public IPersonalSpital creareAngajat() {
        return new Asistent();
    }
}
