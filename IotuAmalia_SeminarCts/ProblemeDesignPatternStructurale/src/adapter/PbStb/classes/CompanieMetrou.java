package adapter.PbStb.classes;

public class CompanieMetrou implements ICompanieDeTransport {
    private IMetrou metrou;

    public CompanieMetrou(IMetrou metrou) {
        this.metrou = metrou;
    }

    @Override
    public void cumparaBilet() {
        metrou.valideazaBilet();
    }
}

