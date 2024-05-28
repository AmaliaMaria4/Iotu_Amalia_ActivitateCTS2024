package strategy.pbSportiv.classes;

public class VerificareVip implements IVerificare{
    @Override
    public void verifica(Spectator spectator) {
        if (spectator.areBilet()) {
            System.out.println("Verificare bilet pentru spectatorul " + spectator.getNume());
        } else {
            System.out.println("Spectatorul " + spectator.getNume() + " nu are bilet.");
        }
    }
}
