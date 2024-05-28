package state.pbFarmacie.classes;

public class Achizitionata implements StareReteta{
    @Override
    public void modificaStare(Reteta reteta) {
        System.out.println("Reteta este achizitionata.");
        // Nu există o altă stare după achiziționare
    }
}
