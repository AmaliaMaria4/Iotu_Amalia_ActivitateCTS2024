package builder.Farmacie.classes;

public class BuildFactura implements IFactura{
    public Factura factura;

    public BuildFactura() {
        this.factura = new Factura(0,false,false,false,false,0,false);
    }

    @Override
    public Factura buildFactura() {
        return factura;
    }

    public BuildFactura setNumarPungi(int numarPungi) {
        factura.setNumarPungi(numarPungi);
        return this;
    }

    public BuildFactura setCerePungiPtMedicamente(boolean cerePungiPtMedicamente) {
        factura.setCerePungiPtMedicamente(cerePungiPtMedicamente);
        return this;
    }

    public BuildFactura setPlataCuCard(boolean plataCuCard) {
        factura.setPlataCuCard(plataCuCard);
        return this;
    }

    public BuildFactura setCardFidelitate(boolean cardFidelitate) {
        factura.setCardFidelitate(cardFidelitate);
        return this;
    }

    public BuildFactura setPrezentareCardFidelitate(boolean prezentareCardFidelitate) {
        factura.setPrezentareCardFidelitate(prezentareCardFidelitate);
        return this;
    }

    public BuildFactura setCotaTVA(float cotaTVA) {
        factura.setCotaTVA(cotaTVA);
        return this;
    }

    public BuildFactura setClientPlatitorTVA(boolean clientPlatitorTVA) {
        factura.setClientPlatitorTVA(clientPlatitorTVA);
        return this;
    }
}
