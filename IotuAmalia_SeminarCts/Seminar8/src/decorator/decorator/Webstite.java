package decorator.decorator;

import decorator.spital.DiagnosticAbstract;

public class Webstite extends Decorator {
    public Webstite(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afisareOnline() {
        System.out.println("In cadrul site-ului nostru ati primit diagnosticul: " + "\n" + super.getNume() + " " + super.getDescriereSimptome() + " " + ((super.isNecesitaSpitalizare()) ? " " : " nu") + " are nev de spitalizare");
    }
}