package strategy.pbSportiv.classes;

public class VerificarePeluza implements IVerificare{
    @Override
    public void verifica(Spectator spectator) {
        if (spectator.areBagaje() && spectator.areHaine()) {
            System.out.println("Verificarea bagajelor și a hainelor pentru spectatorul " + spectator.getNume());
        } else if (spectator.areBagaje()) {
            System.out.println("Verificare bagaje pentru spectatorul " + spectator.getNume());
        } else if (spectator.areHaine()) {
            System.out.println("Verificare haine pentru spectatorul " + spectator.getNume());
        } else {
            System.out.println("Spectatorul " + spectator.getNume() + " nu are nimic de verificat.");
        }
    }
}
