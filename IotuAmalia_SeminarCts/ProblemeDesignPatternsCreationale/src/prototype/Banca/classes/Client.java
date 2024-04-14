package prototype.Banca.classes;

public class Client implements IPrototype{
    private int codClient;
    private String nume;
    private String cnp;  //buletin
    private String iban;  //cardul de credit pt plata

    public Client(int codClient,String nume, String cnp, String iban) {
        this.codClient=codClient;
        this.nume = nume;
        this.cnp = cnp;
        this.iban = iban;
    }

    private Client(){
        super();
    }

    public void setCodClient(int codClient) {
        this.codClient = codClient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("codClient=").append(codClient);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", cnp=").append(cnp);
        sb.append(", iban=").append(iban);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IPrototype copiaza() {
        IPrototype prototype=new Client();
        ((Client) prototype).codClient=this.codClient;
        ((Client) prototype).nume=this.nume;
        ((Client) prototype).cnp=this.cnp;
        ((Client) prototype).iban=this.iban;
        return prototype;
    }
}
