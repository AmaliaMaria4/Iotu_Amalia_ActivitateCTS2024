package state.pbBanca.classes;

public class Bancomat {
    private StareBancomat stare;
    private int suma; // Suma de bani disponibilă în bancomat

    public Bancomat(int suma) {
        this.stare = new NuAreCard(this);
        this.suma = suma;
    }

    public void schimbaStare(StareBancomat stare) {
        this.stare = stare;
    }

    public void retragereBani() {
        stare.retragereBani();
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }
}
