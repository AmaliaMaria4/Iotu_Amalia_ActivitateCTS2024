package state.pbSportiv.main;

import state.pbSportiv.classes.IStare;
import state.pbSportiv.classes.Liber;
import state.pbSportiv.classes.LocTribuna;

public class Main {
    public static void main(String[] args) {
        LocTribuna locTribuna1=new LocTribuna(23);
//        locTribuna1.eliberareLoc();
//        locTribuna1.rezervaLoc();
//        locTribuna1.rezervaLoc();
//        locTribuna1.ocupaLoc();
//        locTribuna1.ocupaLoc();
//        locTribuna1.eliberareLoc();

        IStare stare=new Liber();
        stare.ocupaLoc();

    }
}
