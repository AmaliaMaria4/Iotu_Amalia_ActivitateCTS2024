package state.pbBanca.classes;

public class NuAreBani implements StareBancomat{
    private Bancomat bancomat;

    public NuAreBani(Bancomat bancomat) {
        this.bancomat = bancomat;
    }

    @Override
    public void retragereBani() {
        System.out.println("Nu mai sunt bani în bancomat.");
    }
}
