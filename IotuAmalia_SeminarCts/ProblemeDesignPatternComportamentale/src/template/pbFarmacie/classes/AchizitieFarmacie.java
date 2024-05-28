package template.pbFarmacie.classes;

public class AchizitieFarmacie extends ProcesAchizitieMedicamente{
    public AchizitieFarmacie(String reteta) {
        super(reteta);
    }

    @Override
    public void verificaStoc() {
        if (stocSuficient) {
            System.out.println("Stocul medicamentelor este suficient.");
        } else {
            System.out.println("Stocul medicamentelor nu este suficient.");
        }
    }

    @Override
    public void achizitioneazaMedicamente() {
        System.out.println("Se aduc medicamentele din depozit.");
    }

    @Override
    public void incaseazaBani() {
        System.out.println("Se încasează banii.");
    }

    @Override
    public void emiteBon() {
        System.out.println("Se emite bonul.");
    }
}
