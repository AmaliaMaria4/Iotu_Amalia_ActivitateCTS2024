package composite.PbSpital.main;

import composite.PbSpital.classes.Departament;
import composite.PbSpital.classes.IDepartament;
import composite.PbSpital.classes.Sectie;

public class Main {
    public static void main(String[] args) {
        IDepartament departamentCardiologie = new Departament("Cardiologie");
        IDepartament sectieCardiologieA = new Sectie("Cardiologie A");
        IDepartament sectieCardiologieB = new Sectie("Cardiologie B");

        departamentCardiologie.adaugaSubdepartament(sectieCardiologieA);
        departamentCardiologie.adaugaSubdepartament(sectieCardiologieB);

        IDepartament departamentChirurgie = new Departament("Chirurgie");
        IDepartament sectieChirurgieA = new Sectie("Chirurgie A");

        departamentChirurgie.adaugaSubdepartament(sectieChirurgieA);

        IDepartament spital = new Departament("Spital");
        spital.adaugaSubdepartament(departamentCardiologie);
        spital.adaugaSubdepartament(departamentChirurgie);

        spital.descriere(" ");
    }
}
