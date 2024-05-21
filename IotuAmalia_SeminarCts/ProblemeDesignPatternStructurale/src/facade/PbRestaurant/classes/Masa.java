package facade.PbRestaurant.classes;

public class Masa {
    private boolean masaLibera;
    private boolean masaDebarasata;
    private boolean servetelePuse;

    public Masa() {
        this.masaLibera = true;
        this.masaDebarasata = true; // presupunând că mesele sunt debarasate inițial
        this.servetelePuse = false; // presupunând că nu sunt puse initial servetele
    }

    public boolean isMasaLibera() {
        return masaLibera;
    }

    public boolean isMasaDebarasata() {
        return masaDebarasata;
    }

    public boolean isServetelePuse() {
        return servetelePuse;
    }

    public void ocupaMasa() {
        masaLibera = false;
    }

    public void debaraseazaMasa() {
        masaDebarasata = true;
    }

    public void puneServetele() {
        servetelePuse = true;
    }
}
