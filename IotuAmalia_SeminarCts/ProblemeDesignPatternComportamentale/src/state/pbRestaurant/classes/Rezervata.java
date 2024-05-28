package state.pbRestaurant.classes;

public class Rezervata implements StareMasa{
    @Override
    public void modificaStare(Masa masa) {
        System.out.println("Masa este rezervata.");
        masa.setStare(new Ocupata());
    }
}
