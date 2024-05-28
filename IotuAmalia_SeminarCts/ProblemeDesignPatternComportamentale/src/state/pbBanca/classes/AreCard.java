package state.pbBanca.classes;

public class AreCard implements StareBancomat{
    private Bancomat bancomat;

    public AreCard(Bancomat bancomat) {
        this.bancomat = bancomat;
    }

    @Override
    public void retragereBani() {
        System.out.println("Introduceți PIN-ul.");
        bancomat.schimbaStare(new ArePinIntrodus(bancomat));
    }
}
