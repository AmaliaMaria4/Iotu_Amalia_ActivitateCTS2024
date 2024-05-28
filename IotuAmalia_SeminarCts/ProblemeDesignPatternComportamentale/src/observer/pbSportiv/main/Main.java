package observer.pbSportiv.main;

import observer.pbSportiv.classes.observer.Abonat;
import observer.pbSportiv.classes.observer.Observer;
import observer.pbSportiv.classes.subject.Stadion;
import observer.pbSportiv.classes.subject.Subject;

public class Main {
    public static void main(String[] args) {

        Observer abonat1=new Abonat("Ana");
        Observer abonat2=new Abonat("Elena");
        Observer abonat3=new Abonat("Ion");
    //    Observer vecin1 =new Vecin("M87",1.5f);

//        Subject sala1=new Sala();
//        sala1.adaugaAbonat(abonat1);
//        sala1.adaugaAbonat(abonat2);
//        sala1.adaugaAbonat(abonat3);
//        sala1.notificaMeciFotbal();

       //sala1.stergeAbonat(abonat2);
     //   sala1.adaugaAbonat(vecin1);
 //   sala1.notificaMeciVolei();

        Subject stadion=new Stadion();
        stadion.adaugaAbonat(abonat1);
      stadion.notificaMeciFotbal();
       // stadion.adaugaAbonat(vecin1);
//
       // ((Stadion)stadion).notificaConcert();
    }
}
