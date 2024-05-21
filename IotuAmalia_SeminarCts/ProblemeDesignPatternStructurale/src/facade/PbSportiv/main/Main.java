package facade.PbSportiv.main;

import facade.PbSportiv.classes.AntecedenteStadioane;
import facade.PbSportiv.classes.FacadeStadion;
import facade.PbSportiv.classes.Persoana;
import facade.PbSportiv.classes.Politie;

public class Main {
    public static void main(String[] args) {
        // Creăm o persoană cu seria buletin și codul biletului
        Persoana persoana = new Persoana("12345", "ABCDE");

        // Creăm instanțe pentru celelalte componente
        Politie politie = new Politie();
        AntecedenteStadioane antecedenteStadioane = new AntecedenteStadioane();

        // Creăm instanța pentru Facade și apelăm metoda de verificare
        FacadeStadion facadeStadion = new FacadeStadion(persoana, politie, antecedenteStadioane);
        facadeStadion.verificaPersoana();
    }
}
