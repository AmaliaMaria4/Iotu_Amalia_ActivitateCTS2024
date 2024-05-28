package state.pbSportiv.classes;

public class Ocupat implements IStare{


    @Override
    public void ocupaLoc() {
        System.out.println("suntem in starea ocupat");
    }
}
//poate fi eliberat
//nu poate fi nici rezervat, nici ocupat

