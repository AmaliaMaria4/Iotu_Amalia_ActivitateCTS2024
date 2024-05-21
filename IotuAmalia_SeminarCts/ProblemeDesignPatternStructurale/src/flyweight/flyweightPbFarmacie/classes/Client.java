package flyweight.flyweightPbFarmacie.classes;

public class Client implements IReteta {
    private String numeClient;
    private int nrAsigurare;

    public Client(String numeClient, int nrAsigurare) {
        this.numeClient = numeClient;
        this.nrAsigurare = nrAsigurare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrAsigurare=").append(nrAsigurare);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void printeazaReteta(Reteta reteta) {
        System.out.println(this.toString() + "" + reteta.toString());
    }
}
