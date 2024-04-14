package factoryMethod.Banca.classes;

public class FabricaPersoaneJuridice implements IBanca{
    @Override
    public Clienti createClient(String nume, String nrTelefon, long cnp) {
        return new PersoaneJuridice(nume,nrTelefon,cnp);
    }
}
