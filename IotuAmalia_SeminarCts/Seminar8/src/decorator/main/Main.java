package decorator.main;

import decorator.decorator.AplicatieMobila;
import decorator.decorator.Decorator;
import decorator.decorator.Webstite;
import decorator.spital.Diagnostic;
import decorator.spital.DiagnosticAbstract;

public class Main {
    public static void main(String[] args) {
        DiagnosticAbstract diagnostic = new Diagnostic("Raceala", "Rosu de gat", false);
        diagnostic.printeazaDiagnostic();

        Decorator decorator1 = new AplicatieMobila(diagnostic);
        decorator1.afisareOnline();

        Decorator decorator2 = new Webstite(diagnostic);
        decorator2.afisareOnline();
    }
}