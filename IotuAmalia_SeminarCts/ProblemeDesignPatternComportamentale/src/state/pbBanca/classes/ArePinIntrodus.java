package state.pbBanca.classes;

public class ArePinIntrodus implements StareBancomat{
    private Bancomat bancomat;

    public ArePinIntrodus(Bancomat bancomat) {
        this.bancomat = bancomat;
    }

    @Override
    public void retragereBani() {
        if (bancomat.getSuma() > 0) {
            System.out.println("Se retrag " + bancomat.getSuma() + " lei.");
            bancomat.setSuma(0); // Se golește bancomatul
            bancomat.schimbaStare(new NuAreBani(bancomat));
        } else {
            System.out.println("Nu sunt suficienți bani în bancomat.");
            bancomat.schimbaStare(new NuAreBani(bancomat));
        }
    }
}
