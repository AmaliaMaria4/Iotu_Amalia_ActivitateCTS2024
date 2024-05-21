package adapter.PbFarmacie.classes;

public class AplicatieVanzare implements VecheaAplicatieVanzare{
    @Override
    public void setareMedicament(int idMedicament) {

    }

    @Override
    public boolean verificareDisponibilitate(int numarMedicamente) {
        return numarMedicamente > 0;
    }
}
