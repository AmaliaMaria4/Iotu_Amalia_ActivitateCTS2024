package prototype.Farmacie.classes;

public class Reteta implements IPrototype{
    private String numeMedicament;
    private float cantitateMedicament;
    private float pret;

    public Reteta(String numeMedicament, float cantitateMedicament, float pret) {
        this.numeMedicament = numeMedicament;
        this.cantitateMedicament = cantitateMedicament;
        this.pret = pret;
    }


    private Reteta() {
        super();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", cantitateMedicament=").append(cantitateMedicament);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IPrototype copiaza() {
        IPrototype prototype=new Reteta();
        ((Reteta) prototype).numeMedicament=this.numeMedicament;
        ((Reteta) prototype).cantitateMedicament=this.cantitateMedicament;
        ((Reteta) prototype).pret=this.pret;
        return prototype;
    }
}
