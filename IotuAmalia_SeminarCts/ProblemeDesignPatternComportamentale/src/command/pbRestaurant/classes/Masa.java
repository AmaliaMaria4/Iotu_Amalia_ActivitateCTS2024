package command.pbRestaurant.classes;

public class Masa {
    private int nrMasa;
    private boolean esteOcupata=false;
    private boolean esteRezervata=false;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
       }

    public void ocupaMasa() {
        if (this.esteOcupata == false) {
            System.out.println("masa poate fi ocupata");
            this.esteOcupata = true;
        } else {
            System.out.println("masa nu poate fi ocupata");
        }
    }
    public void  rezervaMasa(){
        if(this.esteRezervata==false){
            System.out.println("masa poate fi rezervata");
            this.esteRezervata=true;
        }else{
            System.out.println("masa nu poate fi rezervata");
        }
    }
}
