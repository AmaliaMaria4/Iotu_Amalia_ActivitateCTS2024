package observer.pbStb1.classes;

public class Calator implements ICalator{
    private String nume;
    private int varsta;
    private int cod;

    public Calator(String nume, int varsta, int cod) {
        this.nume = nume;
        this.varsta = varsta;
        this.cod = cod;
    }

    @Override
    public void receptioneazNotificare(String notificare) {
        System.out.println("Calatorul: "+this.nume+" a primit notificarea "+notificare);
    }
}
