package proxy.proxyPbFarmacie.classes;

public class CumparareMedicamente implements ICumparareMedicamente {
    private boolean areReteta;
    private String numeClient;

    public CumparareMedicamente(boolean areReteta, String numeClient) {
        this.areReteta = areReteta;
        this.numeClient = numeClient;
    }

    public boolean areReteta() {
        return areReteta;
    }

    @Override
    public void descriere() {
        System.out.println(this.numeClient + " dorește să cumpere medicamente.");
    }

    @Override
    public void cumparaMedicamente() {
        System.out.println("Medicamentele au fost achiziționate de către " + this.numeClient + ".");
    }
}