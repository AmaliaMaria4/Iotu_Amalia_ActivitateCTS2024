package state.pbSpital.classes;

public class SubObservatie implements StarePacient{
    @Override
    public void modificaStare(Pacient pacient) {
        System.out.println("Starea de sănătate a pacientului " + pacient.getNume() + " este gravă.");
        pacient.setStare(new Externat());
    }
}

