package adapter.PbSpital.classes;

public class Spital implements MedicamentSpital {
    private String numeSpital;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    @Override
    public void achizitioneazaMedicament() {
        System.out.println("s a achizitionat un medicament");
    }

    @Override
    public void prezintaReteta() {
        System.out.println("s a prezentat reteta!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spital{");
        sb.append("numeSpital='").append(numeSpital).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
