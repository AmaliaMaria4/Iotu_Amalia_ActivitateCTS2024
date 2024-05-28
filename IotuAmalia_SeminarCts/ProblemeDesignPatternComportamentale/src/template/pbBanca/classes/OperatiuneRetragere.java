package template.pbBanca.classes;

public abstract class OperatiuneRetragere {
    protected String card;
    protected int pin;
    protected int suma;

    public OperatiuneRetragere(String card, int pin, int suma) {
        this.card = card;
        this.pin = pin;
        this.suma = suma;
    }

    public abstract void introducereCard();

    public abstract void introducerePin();

    public abstract void specificaSuma();

    public abstract void retragereBani();

    public abstract void retragereCard();

    public final void executaRetragere() {
        introducereCard();
        introducerePin();
        specificaSuma();
        retragereBani();
        retragereCard();
    }
}
