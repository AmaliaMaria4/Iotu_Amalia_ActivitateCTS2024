package state.pbSpital.classes;

public class Externat implements StarePacient {
    @Override
    public void modificaStare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost externat.");

    }
}
