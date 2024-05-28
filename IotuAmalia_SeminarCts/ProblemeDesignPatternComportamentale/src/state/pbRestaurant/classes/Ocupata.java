package state.pbRestaurant.classes;

public class Ocupata implements StareMasa{
    @Override
    public void modificaStare(Masa masa) {
        System.out.println("Masa este ocupata.");
        // Nu facem nimic aici, deoarece starea ocupata nu trece în altă stare direct
    }

    public void elibereazaMasa(Masa masa) {
        System.out.println("Masa este eliberata.");
        masa.setStare(new Libera());
    }
}
