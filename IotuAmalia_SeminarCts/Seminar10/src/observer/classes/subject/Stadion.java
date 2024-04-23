package observer.classes.subject;

public class Stadion extends Subject {
    @Override
    public void notificaMeciFotbal() {
        super.notificaAbonati("azi are loc un meci de fotbal");
    }

    @Override
    public void notificaMeciVolei() {
        super.notificaAbonati("va avea loc un meci de volei pe stadion");
    }

    @Override
    public void notificaMeciHandball() {
        super.notificaAbonati("pe stadion are loc un meci de handball feminin");
    }

    public void notificaConcert() {
       super.notificaAbonati("astazi pe stadion vor canta mai multe formatii");
    }
}
