package state.pbRestaurant.classes;

public class Libera implements StareMasa{
    @Override
    public void modificaStare(Masa masa) {
        System.out.println("Masa este libera.");
    }
}
