package template.pbBanca.classes;

public class RetragereBancomat extends OperatiuneRetragere{
    public RetragereBancomat(String card, int pin, int suma) {
        super(card, pin, suma);
    }

    @Override
    public void introducereCard() {
        System.out.println("Se introduce cardul: " + card);
    }

    @Override
    public void introducerePin() {
        System.out.println("Se introduce PIN-ul: " + pin);
    }

    @Override
    public void specificaSuma() {
        System.out.println("Se specifică suma solicitată: " + suma + " lei");
    }

    @Override
    public void retragereBani() {
        System.out.println("Se retrag " + suma + " lei din bancomat.");
    }

    @Override
    public void retragereCard() {
        System.out.println("Se retrage cardul.");
    }
}
