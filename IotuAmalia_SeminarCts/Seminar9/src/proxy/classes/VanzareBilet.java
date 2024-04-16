package proxy.classes;

public class VanzareBilet implements Vanzare{
    private String meci;
    private int pret;

    public VanzareBilet(String meci, int pret) {
        this.meci = meci;
        this.pret = pret;
    }

    @Override
    public void vinde(Persoana persoana) {
        System.out.println("Persoana: "+persoana.getNume()+" a cumparat bilet la meciul: "+this.meci+", platind "+this.pret+ " lei.");
    }
}
