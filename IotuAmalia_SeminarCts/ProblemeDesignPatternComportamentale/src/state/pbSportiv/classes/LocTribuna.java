package state.pbSportiv.classes;

public class LocTribuna {
    private int nrLoc;
    private IStare stare;

    public LocTribuna(int nrLoc) {
        this.nrLoc = nrLoc;
        this.stare=new Liber();
    }

    public IStare getStare() {
        return stare;
    }

    public void setStare(IStare stare) {
        this.stare = stare;

    }

    public int getNrLoc() {
        return nrLoc;
    }

    public void rezervaLoc(){
        if(this.stare instanceof Liber){
            System.out.println("locul "+this.nrLoc+" a fost rezervat");
            stare=new Rezervat();
        }else{
            System.out.println("locul "+this.nrLoc+ " nu poate fi rezervat");
        }
    }

    public void ocupaLoc(){
        if(this.stare instanceof Liber||this.stare instanceof Rezervat){
            System.out.println("s a ocupat locul "+this.nrLoc);
            stare=new Ocupat();
        }else{
            System.out.println("Nu s a putut ocupa locul "+this.nrLoc);
        }
    }

    public void eliberareLoc(){
        if(this.stare instanceof Ocupat||this.stare instanceof Rezervat){
            System.out.println("locul s a eliberat");
            stare=new Liber();
        }else{
            System.out.println("locul este deja liber");
        }
    }
}
