package chain.pbSTB.classes;

public abstract class MijlocTransport {
    private MijlocTransport mijlocTransport;

    public MijlocTransport getMijlocTransport() {
        return mijlocTransport;
    }

    public void setMijlocTransport(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    public abstract void notifica(Calator calator);
}
