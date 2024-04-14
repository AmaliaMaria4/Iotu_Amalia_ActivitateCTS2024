package builder.Farmacie.main;


import builder.Farmacie.classes.BuildFactura;
import builder.Farmacie.classes.Factura;
import builder.Farmacie.classes.IFactura;

public class Main {
    public static void main(String[] args) {
        Factura factura2=new Factura(3,false,false,true,true,12.5f,false);
        System.out.println(factura2);

    }
}
