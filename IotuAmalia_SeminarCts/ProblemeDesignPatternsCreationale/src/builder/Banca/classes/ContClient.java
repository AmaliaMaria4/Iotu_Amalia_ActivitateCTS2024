package builder.Banca.classes;

public class ContClient{
    private boolean cardDeSalariu;
    private boolean cardAtasat;
    private boolean areInternetBanking;

    public ContClient(boolean cardDeSalariu, boolean cardAtasat, boolean areInternetBanking) {
        this.cardDeSalariu = cardDeSalariu;
        this.cardAtasat = cardAtasat;
        this.areInternetBanking = areInternetBanking;
    }

    public void setCardDeSalariu(boolean cardDeSalariu) {
        this.cardDeSalariu = cardDeSalariu;
    }

    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public void setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContClient{");
        sb.append("cardDeSalariu=").append(cardDeSalariu);
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", areInternetBanking=").append(areInternetBanking);
        sb.append('}');
        return sb.toString();
    }
}
