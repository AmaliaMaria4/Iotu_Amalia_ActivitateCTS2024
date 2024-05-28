package state.pbBanca.classes;

public class NuAreCard implements StareBancomat {
    private Bancomat bancomat;

    public NuAreCard(Bancomat bancomat) {
        this.bancomat = bancomat;
    }

    @Override
    public void retragereBani() {
        System.out.println("Introduceți un card valid.");
    }
}
