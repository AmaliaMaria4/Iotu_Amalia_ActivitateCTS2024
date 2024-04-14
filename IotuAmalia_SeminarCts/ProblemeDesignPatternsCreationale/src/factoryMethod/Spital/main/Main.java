package factoryMethod.Spital.main;

import factoryMethod.Spital.classes.FabricaMedic;
import factoryMethod.Spital.classes.IFabricaSpital;
import factoryMethod.Spital.classes.IPersonalSpital;

public class Main {
    public static void afisare(IFabricaSpital fabricaSpital) {
        IPersonalSpital personalSpital = fabricaSpital.creareAngajat();
        personalSpital.descriere();
    }

    public static void main(String[] args) {
        afisare(new FabricaMedic());
    }
}