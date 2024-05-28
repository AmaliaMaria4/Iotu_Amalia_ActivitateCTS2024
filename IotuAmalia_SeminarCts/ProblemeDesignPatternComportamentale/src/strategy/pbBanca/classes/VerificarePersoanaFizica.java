package strategy.pbBanca.classes;

public class VerificarePersoanaFizica implements IVerificareDocumente{
    @Override
    public void verificaDocumente() {
        System.out.println("Se verifică buletinul și adeverința de la muncă pentru persoana fizică ");
    }
}
