package observer.classes.subject;

public class Sala extends Subject{
    @Override
    public void notificaMeciFotbal() {
       String mesaj="Va avea loc un meci de fotbal in data de 23 apr.";
       notificaAbonati(mesaj);
    }

    @Override
    public void notificaMeciVolei() {
        String mesaj="Va avea loc un meci de volei in data de 24 apr.";
        notificaAbonati(mesaj);
    }

    @Override
    public void notificaMeciHandball() {
        String mesaj="Va avea loc un meci de handball in data de 25 apr.";
        notificaAbonati(mesaj);
    }
}
