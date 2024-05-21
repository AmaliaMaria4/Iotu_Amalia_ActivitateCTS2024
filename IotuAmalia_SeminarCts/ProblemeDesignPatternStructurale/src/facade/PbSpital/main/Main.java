package facade.PbSpital.main;

import facade.PbSpital.classes.Pacient;
import facade.PbSpital.classes.Salon;
import facade.PbSpital.classes.SpitalFacade;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ion", "grava");
        Salon salon = new Salon();

        SpitalFacade facadeSpital = new SpitalFacade(pacient, salon);
        facadeSpital.verificareInternare();
    }
}

//6. Pentru internarea unui pacient în spital trebuie verificata gravitatea starii pacientului prin
//intermediul clasei Pacient, verificarea confirmarii Medicului ca trebuie internat, verificarea
//disponibilitatii unui pat în camera prin intermediul clasei Salon care are lista cu paturile libere si
//ocupate. Spitalul dorete ca personalul spitalului sa nu fi nevoit sa faca aceste verificari separat ci
//sa fie dezvoltat un modul care sa permita aceasta verificarea facila a acestor lucruri.

// pt internare pacient-verificare stare pacient in clas PACIENT
//verificare confirmare MEDIC ca trb internat, verificare disponibilitate pat in camera in cls SALON(are lista  cu paturi libere si ocupate)