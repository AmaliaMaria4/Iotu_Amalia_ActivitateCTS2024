package flyweight.flyweightPbBanca.classes;

public class Client implements ICont{
    private String numeClient;
    private String adresaClient;
    private String nrTelClient;
    private String adresaMailClient;

    public Client(String numeClient, String adresaClient, String nrTelClient, String adresaMailClient) {
        this.numeClient = numeClient;
        this.adresaClient = adresaClient;
        this.nrTelClient = nrTelClient;
        this.adresaMailClient = adresaMailClient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", adresaClient='").append(adresaClient).append('\'');
        sb.append(", nrTelClient='").append(nrTelClient).append('\'');
        sb.append(", adresaMailClient='").append(adresaMailClient).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void printeazaCont(ContClient contClient) {
        System.out.println(this.toString()+contClient.toString());
    }
}
