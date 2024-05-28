package strategy.pbBanca.classes;

public class VerificarePersoanaJuridica implements IVerificareDocumente{
    @Override
    public void verificaDocumente() {
        System.out.println("Se verifică actele de înființare a firmei și dovada înregistrării la Registrul Comerțului pentru persoana juridică.");
    }
}
