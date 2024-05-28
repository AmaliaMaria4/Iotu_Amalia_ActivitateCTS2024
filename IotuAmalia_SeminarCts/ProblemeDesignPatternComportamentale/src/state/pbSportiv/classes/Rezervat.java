package state.pbSportiv.classes;

public class Rezervat implements IStare{


    @Override
    public void ocupaLoc() {
        System.out.println("suntem in starea rezervat");
    }
}
//nu poate fi rezervat de alt spectator
//din liber intra in rezervat
