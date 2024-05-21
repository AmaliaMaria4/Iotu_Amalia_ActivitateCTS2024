package proxy.proxyPbSpital.classes;

public class Internare implements IInternareSpital {
    private boolean areAsigurare;
    private String numePacient;

    public Internare(boolean areAsigurare, String numePacient) {
        this.areAsigurare = areAsigurare;
        this.numePacient = numePacient;
    }

    public boolean areAsigurare() {
        return areAsigurare;
    }

    @Override
    public void descriere() {
        System.out.println(this.numePacient + " dorește internarea.");
    }

    @Override
    public void internare() {
        System.out.println("Pacientul " + this.numePacient + " a fost internat.");
    }
}
