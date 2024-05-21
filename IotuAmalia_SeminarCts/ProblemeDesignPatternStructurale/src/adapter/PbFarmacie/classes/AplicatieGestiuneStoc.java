package adapter.PbFarmacie.classes;

public class AplicatieGestiuneStoc implements NouaAplicatieGestiune{
    @Override
    public boolean verificaStocPentruMedicament(int idMedicament, int numarDorit) {
        return numarDorit <= 100;
    }
}
