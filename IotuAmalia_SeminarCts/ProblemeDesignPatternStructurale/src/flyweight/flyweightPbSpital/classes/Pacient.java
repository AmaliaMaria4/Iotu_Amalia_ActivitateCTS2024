package flyweight.flyweightPbSpital.classes;

public class Pacient implements ISalon{
    private String numePacient;
    private String nrTelefonPacient;
    private String adresaPacient;

    public Pacient(String numePacient, String nrTelefonPacient, String adresaPacient) {
        this.numePacient = numePacient;
        this.nrTelefonPacient = nrTelefonPacient;
        this.adresaPacient = adresaPacient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", nrTelefonPacient='").append(nrTelefonPacient).append('\'');
        sb.append(", adresaPacient='").append(adresaPacient).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Salon salon) {
        System.out.println(this.toString()+salon.toString());
    }
}
