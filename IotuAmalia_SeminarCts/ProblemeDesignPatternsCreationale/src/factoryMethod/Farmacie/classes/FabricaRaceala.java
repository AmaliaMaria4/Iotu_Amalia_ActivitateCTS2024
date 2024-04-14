package factoryMethod.Farmacie.classes;

public class FabricaRaceala implements IFabricaFarmacie{
    @Override
    public Medicamente createObject(String denumire, int pret) {
        return new Raceala(denumire,pret);
    }
}
