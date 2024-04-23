package strategy.classes;

public class VerificatorPeluza implements Verificator{
    @Override
    public void verifica(String numeSuporter) {
        System.out.println("Se verifica bagajele si hainele lui: "+numeSuporter);
    }
}
