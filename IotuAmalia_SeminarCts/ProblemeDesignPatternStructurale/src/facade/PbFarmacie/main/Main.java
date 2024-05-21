package facade.PbFarmacie.main;

import facade.PbFarmacie.classes.FacadeFarmacie;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creăm instanța pentru Facade și apelăm metoda de verificare
        FacadeFarmacie facadeFarmacie = new FacadeFarmacie();
        facadeFarmacie.verificaElemente(true,true,false, LocalDate.of(2024,04,12),12,
                List.of("paracetamol","ibuprofen"),List.of("paracetamol","algocalim","decasept"),LocalDate.of(2024,05,10));


    }
}
