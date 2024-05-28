package observer.pbSpital.classes;


public class Spital extends Subject {

    @Override
    public void notificaAAparutUnVirus() {
        super.notificaAbonat("a aparut un nou virus");
    }

    @Override
    public void notificaAAparutOEpidemie() {
        super.notificaAbonat(" a aparut o noua epidemie");

    }
}
