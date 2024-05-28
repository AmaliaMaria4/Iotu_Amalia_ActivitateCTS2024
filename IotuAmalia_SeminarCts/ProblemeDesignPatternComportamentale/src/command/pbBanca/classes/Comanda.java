package command.pbBanca.classes;

public abstract class Comanda {
    private ContBancar cont;
    private float suma;

    public Comanda(ContBancar cont, float suma) {
        this.cont = cont;
        this.suma = suma;
    }

    public ContBancar getCont() {
        return cont;
    }

    public float getSuma() {
        return suma;
    }
    public  abstract void executa();
}
