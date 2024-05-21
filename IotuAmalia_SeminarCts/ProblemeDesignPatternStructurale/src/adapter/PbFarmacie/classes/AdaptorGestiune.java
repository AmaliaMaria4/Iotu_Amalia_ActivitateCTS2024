package adapter.PbFarmacie.classes;

public class AdaptorGestiune implements VecheaAplicatieVanzare {
    //adaptorul il fac pt noua aplicatie?;mereu pt ce nu am si vreau sa integrez?
    //imlementez ce am deja?
    private AplicatieGestiuneStoc aplicatieGestiuneStoc;

    public AdaptorGestiune(AplicatieGestiuneStoc aplicatieGestiuneStoc) {
        this.aplicatieGestiuneStoc = aplicatieGestiuneStoc;
    }



    @Override
    public void setareMedicament(int idMedicament) {

    }

    @Override
    public boolean verificareDisponibilitate(int numarMedicamente) {
        return false;
    }
}
