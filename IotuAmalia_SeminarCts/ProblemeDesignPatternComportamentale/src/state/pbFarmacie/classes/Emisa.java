package state.pbFarmacie.classes;

public class Emisa implements StareReteta{
    @Override
    public void modificaStare(Reteta reteta) {
        System.out.println("Reteta este emisa.");
        reteta.setStare(new Solicitata());
    }
}

