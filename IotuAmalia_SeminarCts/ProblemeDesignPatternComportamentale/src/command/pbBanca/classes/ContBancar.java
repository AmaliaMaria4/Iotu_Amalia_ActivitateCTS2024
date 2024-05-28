package command.pbBanca.classes;

public class ContBancar {
    private String detionator;
    private float sold;

    public ContBancar(String detionator) {
        this.detionator = detionator;
    }

    public void constituire(float suma) {
        sold = suma;
        System.out.println(" s a constituit contul cu suma " + suma);
    }

    public void retragere(float suma) {
        if (suma <= sold) {
            sold -= suma;
            System.out.println("s a retrat suma de " + suma);
        } else {
            System.out.println("fonduri insuficiente");
        }
    }

    public void depunere(float suma) {
        sold += suma;
        System.out.println(" s a depus suma " + suma);
    }
}
