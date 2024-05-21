package proxy.proxyPbSpital.classes;

public class ProxyInternare implements IInternareSpital {
    private Internare internare;

    public ProxyInternare(Internare internare) {
        this.internare = internare;
    }

    @Override
    public void descriere() {
        internare.descriere();
    }

    @Override
    public void internare() {
        if (internare.areAsigurare()) {
            internare.internare();
        } else {
            System.out.println("Internarea nu este permisă pentru pacientul fără asigurare de sănătate.");
        }
    }
}