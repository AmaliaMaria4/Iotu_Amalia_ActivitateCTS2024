package proxy.PbSportiv.classes;

public class VanzareBilet implements IVanzareBilete {

    @Override
    public void vindeBilet(Persoana persoana) {
        System.out.println("Persoana "+persoana.getNume()+" cu varsta de "+persoana.getVarsta()+" a putut sa aschizitioneze bilet");
    }
}
