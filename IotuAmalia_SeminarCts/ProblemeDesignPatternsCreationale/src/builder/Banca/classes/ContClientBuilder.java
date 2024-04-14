package builder.Banca.classes;

public class ContClientBuilder implements AbstractBuilder{

    private ContClient client;
    @Override
    public ContClient build() {
        return client;
    }

    public ContClientBuilder() {
        client=new ContClient(false,false,false);
    }

    public ContClientBuilder setCardDeSalariu(boolean cardDeSalariu) {
        client.setCardDeSalariu(cardDeSalariu);
        return this;
    }

    public ContClientBuilder setCardAtasat(boolean cardAtasat) {
        client.setCardAtasat(cardAtasat);
        return this;
    }

    public ContClientBuilder setAreInternetBanking(boolean areInternetBanking) {
    client.setAreInternetBanking(areInternetBanking);
    return this;
    }
}
