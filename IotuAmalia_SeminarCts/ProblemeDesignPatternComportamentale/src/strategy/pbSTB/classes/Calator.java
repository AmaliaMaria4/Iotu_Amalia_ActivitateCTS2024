package strategy.pbSTB.classes;

public class Calator {
    private String nume;
    private int varsta;
    private String cnp;
    private IMetodaPlata metodaPlata;

    public Calator(String nume, int varsta, String cnp, IMetodaPlata metodaPlata) {
        this.nume = nume;
        this.varsta = varsta;
        this.cnp = cnp;
        this.metodaPlata = metodaPlata;
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

//    public void plateste(){
//        metodaPlata.plataCalatorie();
//    }

    public IMetodaPlata getMetodaPlata() {
        return metodaPlata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", cnp='").append(cnp).append('\'');
        sb.append(", metodaPlata=").append(metodaPlata);
        sb.append('}');
        return sb.toString();
    }
}
