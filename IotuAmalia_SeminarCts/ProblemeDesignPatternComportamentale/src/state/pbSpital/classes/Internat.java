package state.pbSpital.classes;

public class Internat implements StarePacient{
    @Override
    public void modificaStare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " este internat.");
        pacient.setStare(new SubObservatie());
    }
}
