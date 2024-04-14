package prototype.Farmacie.main;

import prototype.Farmacie.classes.IPrototype;
import prototype.Farmacie.classes.Reteta;

public class Main {
    public static void main(String[] args) {
        IPrototype reteta1=new Reteta("Nurofen",1.2f,12.4f);
        IPrototype reteta2=reteta1.copiaza();
        System.out.println(reteta1.toString());
        System.out.println(reteta2.toString());

    }
}




