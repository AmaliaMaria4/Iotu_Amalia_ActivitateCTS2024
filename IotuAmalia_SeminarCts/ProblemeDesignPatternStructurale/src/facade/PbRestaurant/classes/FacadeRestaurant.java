package facade.PbRestaurant.classes;

public class FacadeRestaurant {
    private Masa masa;

    public FacadeRestaurant(Masa masa) {
        this.masa = masa;
    }

    public boolean verificaMasa() {
        if (!masa.isMasaLibera()) {
            System.out.println("Masa este ocupată.");
            return false;
        }

        if (!masa.isMasaDebarasata()) {
            System.out.println("Masa nu este debarasată.");
            return false;
        }

        if (!masa.isServetelePuse()) {
            System.out.println("Servetelele nu au fost puse pe masă.");
            return false;
        }

        System.out.println("Masa este pregătită pentru a fi ocupată.");
        return true;
    }
}
