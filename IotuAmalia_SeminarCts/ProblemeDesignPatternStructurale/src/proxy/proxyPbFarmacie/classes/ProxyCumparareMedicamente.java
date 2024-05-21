package proxy.proxyPbFarmacie.classes;

public class ProxyCumparareMedicamente implements ICumparareMedicamente {
    private CumparareMedicamente cumparareMedicamente;

    public ProxyCumparareMedicamente(CumparareMedicamente cumparareMedicamente) {
        this.cumparareMedicamente = cumparareMedicamente;
    }

    @Override
    public void descriere() {
        cumparareMedicamente.descriere();
    }

    @Override
    public void cumparaMedicamente() {
        if (cumparareMedicamente.areReteta()) {
            cumparareMedicamente.cumparaMedicamente();
        } else {
            System.out.println("Cumpărarea de medicamente nu este permisă pentru clientul fără rețetă.");
        }
    }
}
