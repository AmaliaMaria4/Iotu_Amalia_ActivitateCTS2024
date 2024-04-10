package decorator.decorator;

import decorator.spital.DiagnosticAbstract;

public class AplicatieMobila extends Decorator {

    public AplicatieMobila(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afisareOnline() {
        System.out.println("In cadrul aplicatiei mobile ati primit diagnosticul: " + "\n" + super.getNume() + " " + super.getDescriereSimptome() + " " + ((super.isNecesitaSpitalizare()) ? " " : " nu") + " are nev de spitalizare");

    }
}
