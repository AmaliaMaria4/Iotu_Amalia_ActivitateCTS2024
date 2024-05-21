package adapter.PbSpital.classes;

public class AdapterFarmacie implements MedicamentSpital{
   private MedicamentFarmacie medicamentFarmacie;

    public AdapterFarmacie(MedicamentFarmacie medicamentFarmacie) {
        this.medicamentFarmacie = medicamentFarmacie;
    }

    @Override
    public void achizitioneazaMedicament() {
        medicamentFarmacie.cumparaMedicament();
    }

    @Override
    public void prezintaReteta() {
    }
    //implementez ce am avut mai intai: spitalul
}
