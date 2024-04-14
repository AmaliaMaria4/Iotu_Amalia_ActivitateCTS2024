package factoryMethod.Farmacie.classes;

public interface IFabricaFarmacie {
    Medicamente createObject(String denumire, int pret);
}
