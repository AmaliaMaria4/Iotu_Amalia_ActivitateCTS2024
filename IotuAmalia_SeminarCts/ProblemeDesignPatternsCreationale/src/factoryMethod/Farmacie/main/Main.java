package factoryMethod.Farmacie.main;


import factoryMethod.Farmacie.classes.*;

public class Main {

    public static void afisare(IFabricaFarmacie fabricaFarmacie, String denumire, int pret){
        Medicamente medicamente=fabricaFarmacie.createObject(denumire,pret);
        System.out.println(medicamente.toString());
    }
    public static void main(String[] args) {
        afisare(new FabricaBody(),"Crema pt corp",23);
        afisare(new FabricaDurere(),"Paracetamol",13);
        afisare(new FabricaRaceala(),"Nurofen",30);
    }
}
