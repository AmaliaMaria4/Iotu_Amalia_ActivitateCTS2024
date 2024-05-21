package facade.PbSpital.classes;

public class SpitalFacade {
    private Pacient pacient;
    private Salon salon;

    public SpitalFacade(Pacient pacient, Salon salon) {
        this.pacient = pacient;
        this.salon = salon;
    }

    public boolean verificareInternare() {
        // Verificarea gravității stării pacientului
        if (!pacient.esteInStareGrava()) {
            System.out.println("Pacientul nu este în stare gravă, nu poate fi internat.");
            return false;
        }

        // Verificarea disponibilității unui pat în salon
        if (!salon.arePatLiber()) {
            System.out.println("Nu există paturi libere în salon, internarea nu poate fi efectuată.");
            return false;
        }

        // Alte verificări, cum ar fi confirmarea medicului, pot fi adăugate aici

        System.out.println("Internarea poate fi efectuată.");
        return true;
    }
}
