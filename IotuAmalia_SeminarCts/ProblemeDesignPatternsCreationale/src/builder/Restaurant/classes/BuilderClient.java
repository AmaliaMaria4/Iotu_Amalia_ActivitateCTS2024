package builder.Restaurant.classes;

public class BuilderClient implements IBuilder {
    public Client client;

    public BuilderClient(){
        this.client=new Client(false,false,false,false,"");
    }

    @Override
    public Client clientBuild() {
        return client;
    }

    public BuilderClient setAsezareLaGeam(boolean asezareLaGeam) {
        client.setAsezareLaGeam(asezareLaGeam);
        return this;
    }

    public BuilderClient setScauneErgonomice(boolean scauneErgonomice) {
        client.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    public BuilderClient setDecorareaMesei(boolean decorareaMesei) {
       client.setDecorareaMesei(decorareaMesei);
       return this;
    }

    public BuilderClient setMuzicaAmbientala(boolean muzicaAmbientala) {
       client.setMuzicaAmbientala(muzicaAmbientala);
       return this;
    }

    public BuilderClient setGenMuzical(String genMuzical) {
        client.setGenMuzical(genMuzical);
        return this;
    }
}
