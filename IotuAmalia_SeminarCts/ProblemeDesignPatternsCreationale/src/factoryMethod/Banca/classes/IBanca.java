package factoryMethod.Banca.classes;

public interface IBanca {
    Clienti createClient(String nume,String nrTelefon, long cnp);
}
