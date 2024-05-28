package template.pbFarmacie.classes;

public abstract class ProcesAchizitieMedicamente {
    protected String reteta;
    protected boolean stocSuficient;

    public ProcesAchizitieMedicamente(String reteta) {
        this.reteta = reteta;
    }

    public abstract void verificaStoc();

    public abstract void achizitioneazaMedicamente();

    public abstract void incaseazaBani();

    public abstract void emiteBon();

    public final void executaAchizitie() {
        verificaStoc();
        if (stocSuficient) {
            achizitioneazaMedicamente();
            incaseazaBani();
            emiteBon();
        } else {
            System.out.println("Stocul de medicamente nu este suficient.");
        }
    }
}
