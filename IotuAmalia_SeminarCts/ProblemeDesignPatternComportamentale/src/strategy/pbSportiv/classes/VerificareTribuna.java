package strategy.pbSportiv.classes;

public class VerificareTribuna implements IVerificare{
    @Override
    public void verifica(Spectator spectator) {
        if (spectator.areBagaje()) {
            System.out.println("Verificare bagaje pentru spectatorul " + spectator.getNume());
        } else {
            System.out.println("Spectatorul " + spectator.getNume() + " nu are bagaje.");
        }
    }
}
