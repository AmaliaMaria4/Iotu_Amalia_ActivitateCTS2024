package adapter.PbSpital.classes;

import java.util.List;

public class Farmacie implements MedicamentFarmacie{
    private String numeFarmacie;
    private String numeMedicament;
    private List<String> listMedicamente;

    public Farmacie(String numeFarmacie, String numeMedicament, List<String> listMedicamente) {
        this.numeFarmacie = numeFarmacie;
        this.numeMedicament = numeMedicament;
        this.listMedicamente = listMedicamente;
    }

    public void setListMedicamente(List<String> listMedicamente) {
       listMedicamente.add(numeMedicament);
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("medicamentul "+numeMedicament+" a fost cumparat de la farmacia "+numeFarmacie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Farmacie{");
        sb.append("numeFarmacie='").append(numeFarmacie).append('\'');
        sb.append(", listMedicamente=").append(listMedicamente);
        sb.append('}');
        return sb.toString();
    }


}
