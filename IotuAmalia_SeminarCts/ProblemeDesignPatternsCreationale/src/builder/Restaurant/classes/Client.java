package builder.Restaurant.classes;

public class Client {
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareaMesei;
    private boolean muzicaAmbientala;
    private String genMuzical;

    public Client(boolean asezareLaGeam, boolean scauneErgonomice, boolean decorareaMesei, boolean muzicaAmbientala, String genMuzical) {
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareaMesei = decorareaMesei;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzical = genMuzical;
    }

    public void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("asezareLaGeam=").append(asezareLaGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareaMesei=").append(decorareaMesei);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append(", genMuzical='").append(genMuzical).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
