package factoryMethod.Banca.classes;

public class FabricaPersoaneFizice implements IBanca{
    @Override
    public Clienti createClient(String nume, String nrTelefon, long cnp) {
        return new PersoaneFizice(nume,nrTelefon,cnp);
    }
}
