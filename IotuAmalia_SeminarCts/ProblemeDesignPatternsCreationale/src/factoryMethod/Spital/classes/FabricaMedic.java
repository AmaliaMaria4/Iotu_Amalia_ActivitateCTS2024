package factoryMethod.Spital.classes;

public class FabricaMedic implements IFabricaSpital{
    @Override
    public IPersonalSpital creareAngajat() {
        return new Medic();
    }
}
