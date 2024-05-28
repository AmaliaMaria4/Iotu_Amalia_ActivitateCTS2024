package state.pbRestaurant.classes;

public class Masa {
    private StareMasa stare;

    public Masa() {
        this.stare = new Libera();
    }

    public void setStare(StareMasa stare) {
        this.stare = stare;
    }

    public void modificaStare() {
        stare.modificaStare(this);
    }
}
