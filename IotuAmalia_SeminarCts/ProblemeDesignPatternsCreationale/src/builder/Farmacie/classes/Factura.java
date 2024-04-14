package builder.Farmacie.classes;

public class Factura {
    private int numarPungi;
    private boolean cerePungiPtMedicamente;
    private boolean plataCuCard;
    private boolean cardFidelitate;
    private boolean prezentareCardFidelitate;
    private float cotaTVA;
    private boolean clientPlatitorTVA;

    public Factura(int numarPungi, boolean cerePungiPtMedicamente, boolean plataCuCard, boolean cardFidelitate, boolean prezentareCardFidelitate, float cotaTVA, boolean clientPlatitorTVA) {
        this.numarPungi = numarPungi;
        this.cerePungiPtMedicamente = cerePungiPtMedicamente;
        this.plataCuCard = plataCuCard;
        this.cardFidelitate = cardFidelitate;
        this.prezentareCardFidelitate = prezentareCardFidelitate;
        this.cotaTVA = cotaTVA;
        this.clientPlatitorTVA = clientPlatitorTVA;
    }

    public void setNumarPungi(int numarPungi) {
        this.numarPungi = numarPungi;
    }

    public void setCerePungiPtMedicamente(boolean cerePungiPtMedicamente) {
        this.cerePungiPtMedicamente = cerePungiPtMedicamente;
    }

    public void setPlataCuCard(boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public void setPrezentareCardFidelitate(boolean prezentareCardFidelitate) {
        this.prezentareCardFidelitate = prezentareCardFidelitate;
    }

    public void setCotaTVA(float cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    public void setClientPlatitorTVA(boolean clientPlatitorTVA) {
        this.clientPlatitorTVA = clientPlatitorTVA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("numarPungi=").append(numarPungi);
        sb.append(", cerePungiPtMedicamente=").append(cerePungiPtMedicamente);
        sb.append(", plataCuCard=").append(plataCuCard);
        sb.append(", cardFidelitate=").append(cardFidelitate);
        sb.append(", prezentareCardFidelitate=").append(prezentareCardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append(", clientPlatitorTVA=").append(clientPlatitorTVA);
        sb.append('}');
        return sb.toString();
    }
}
