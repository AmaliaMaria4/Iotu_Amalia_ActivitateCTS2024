package builder.main;

import builder.classes.Pacient;
import builder.classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new PacientBuilder().setPatRabatabil(true).setHalatPtIbterior(true).setMicDejun(true).setPapuciDeCamera(true).build();
        System.out.println();
        Pacient pacient1=new PacientBuilder().setHalatPtIbterior(true).build();
        System.out.println(pacient1);
        System.out.println(pacient);
    }
}
