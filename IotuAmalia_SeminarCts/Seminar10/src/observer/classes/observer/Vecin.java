package observer.classes.observer;

public class Vecin implements Observer{
    private String numeBloc;
    private float distanta;

    public Vecin(String numeBloc, float distanta) {
        this.numeBloc = numeBloc;
        this.distanta = distanta;
    }

    @Override
    public void primesteNotoficare(String mesaj) {
        System.out.println(this.numeBloc +" sala aflata la o distanta de "+this.distanta+ " a trimis catre abonati urmatorul mesaj: "+mesaj);
    }
}
