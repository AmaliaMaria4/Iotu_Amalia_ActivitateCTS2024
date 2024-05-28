package state.pbFarmacie.classes;

public class Solicitata implements StareReteta{
    @Override
    public void modificaStare(Reteta reteta) {
        System.out.println("Reteta este solicitata.");
        reteta.setStare(new Achizitionata());
    }
}
