package facade.PbStb.classes;

public class Facade {
    private Buton butonFata;
    private Buton butonMijloc;
    private Buton butonSpate;

    public Facade() {
        Usa usaFata=new Usa();
        Usa usaMijloc=new Usa();
        Usa usaSpate=new Usa();
        butonFata=new Buton(usaFata);
        butonMijloc=new Buton(usaMijloc);
        butonSpate=new Buton(usaSpate);
    }

    public void apasaButonModLiber(){
        butonFata.getUsa().deschidereibere();
        butonMijloc.getUsa().deschidereibere();
        butonSpate.getUsa().deschidereibere();
    }
    public void apasaButonFortat(){
        butonFata.getUsa().deschidereFortata();
        butonMijloc.getUsa().deschidereFortata();
        butonSpate.getUsa().deschidereFortata();
    }
}
