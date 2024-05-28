package observer.pbSpital.classes;

public class Pacient implements Observer{
    private String numePacient;

    public Pacient(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public void primesteNotificare(String notificare) {
        System.out.println("Pacientul "+this.numePacient+" a primit notificarea "+notificare);
    }
}
