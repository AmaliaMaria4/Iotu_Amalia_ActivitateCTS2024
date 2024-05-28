package observer.pbSportiv.classes.observer;

public class Abonat implements Observer{
    private String nume;

    public Abonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotoficare(String mesaj) {
        System.out.println(this.nume+" ai primit mesajul: "+mesaj);
    }
}
