package simpleFactory.Banca.classes;

public abstract class Credit {
    private float suma;
    private float dobanda;

    public Credit(float suma, float dobanda) {
        this.suma = suma;
        this.dobanda = dobanda;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Credit{");
        sb.append("suma=").append(suma);
        sb.append(", dobanda=").append(dobanda);
        sb.append('}');
        return sb.toString();
    }

    public abstract void afisareCredit();
}
