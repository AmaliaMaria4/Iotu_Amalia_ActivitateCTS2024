package observer.pbSpital.main;

import observer.pbSpital.classes.Observer;
import observer.pbSpital.classes.Pacient;
import observer.pbSpital.classes.Spital;
import observer.pbSpital.classes.Subject;

public class Main {
    public static void main(String[] args) {
        Observer pacient1=new Pacient("ana");
        Observer pacient2=new Pacient("ion");
        Observer pacient3=new Pacient("maia");
        Observer pacient4=new Pacient("clara");

        Subject spital=new Spital();
        spital.adaugaPacient(pacient1);
        spital.adaugaPacient(pacient2);
        spital.adaugaPacient(pacient3);
        spital.notificaAAparutOEpidemie();
        System.out.println();
      spital.stergePacient(pacient2);
     spital.adaugaPacient(pacient4);
       spital.notificaAAparutUnVirus();
    }
}
