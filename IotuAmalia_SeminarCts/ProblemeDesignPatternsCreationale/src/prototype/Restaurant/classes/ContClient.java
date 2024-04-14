package prototype.Restaurant.classes;

public class ContClient implements IPrototype{
    private String numeClient;
    private String nrTelefon;

    public ContClient(String numeClient, String nrTelefon) {
        this.numeClient = numeClient;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContClient{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrTelefon=").append(nrTelefon);
        sb.append('}');
        return sb.toString();
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    private ContClient() {
        super();
    }

    @Override
    public IPrototype copiaza() {
        IPrototype prototype=new ContClient();
        ((ContClient) prototype).numeClient=this.numeClient;
        ((ContClient) prototype).nrTelefon=this.nrTelefon;
        return prototype;
    }
}
