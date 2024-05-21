package facade.PbRestaurant.main;

import facade.PbRestaurant.classes.FacadeRestaurant;
import facade.PbRestaurant.classes.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa();
        FacadeRestaurant facadeRestaurant = new FacadeRestaurant(masa);

        // Simulăm cazurile de verificare a stării mesei
        System.out.println("Verificare masa pentru un client nou:");
        masa.ocupaMasa(); // simulăm ocuparea mesei
        masa.debaraseazaMasa(); // simulăm debarasarea mesei
        masa.puneServetele(); // simulăm punerea servetelelor pe masă
        facadeRestaurant.verificaMasa(); // verificăm starea mesei cu ajutorul facade-ului

//        // Verificare pentru o altă masă
//        System.out.println("\nVerificare masa pentru un alt client:");
//        Masa altaMasa = new Masa();
//        FacadeRestaurant altaFacadeRestaurant = new FacadeRestaurant(altaMasa);
//        altaFacadeRestaurant.verificaMasa(); // verificăm starea altei mese cu ajutorul facade-ului
    }
}
