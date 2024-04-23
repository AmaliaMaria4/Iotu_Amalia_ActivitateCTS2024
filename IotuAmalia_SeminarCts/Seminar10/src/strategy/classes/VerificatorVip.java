package strategy.classes;

public class VerificatorVip implements Verificator{

    @Override
    public void verifica(String numeSuporter) {
        System.out.println("Este verificat biletul lui: "+numeSuporter);
    }
}
