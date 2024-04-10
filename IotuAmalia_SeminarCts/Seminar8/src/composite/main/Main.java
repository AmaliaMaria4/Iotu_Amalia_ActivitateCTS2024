package composite.main;

import composite.classes.Departament;
import composite.classes.Sectie;
import composite.classes.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta cardiologie=new Departament("Cardiologie", "Ionescu");
        StructuraAbstracta oftalmologie=new Departament("Oftalmologie", "Popescu");

        StructuraAbstracta terapieIntensiva=new Sectie("Terapie intensiva ",10,"Grigore");
        StructuraAbstracta donare=new Sectie("Donare de sange ",5,"Pavel");
        StructuraAbstracta optometrie=new Sectie("Optometrie ",2,"Marinescu");

        cardiologie.adaugaStructura(terapieIntensiva);
        cardiologie.adaugaStructura(donare);
        oftalmologie.adaugaStructura(optometrie);

        StructuraAbstracta spital=new Departament("Spital", "Gheorghe");
        spital.adaugaStructura(oftalmologie);
        spital.adaugaStructura(cardiologie);
        //oftalmologie.adaugaStructura(cardiologie);
        spital.afiseazaDescriere(" ");
    }
}
