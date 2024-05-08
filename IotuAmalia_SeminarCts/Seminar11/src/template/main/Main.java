package template.main;

import template.classes.Pacient;
import template.classes.SpitalPublic;

public class Main {
    public static void main(String[] args) {
        SpitalPublic spitalPublic=new SpitalPublic("Elias", 2);
        Pacient pacient1=new Pacient("Ana",5);
        Pacient pacient2=new Pacient("Ion",3);
        Pacient pacient3=new Pacient("Alex",1);

       // spitalPublic.analizaSanatate(pacient1);  nu ma lasa
        spitalPublic.internare(pacient1);
        spitalPublic.internare(pacient2);
        spitalPublic.internare(pacient3);

    }
}

