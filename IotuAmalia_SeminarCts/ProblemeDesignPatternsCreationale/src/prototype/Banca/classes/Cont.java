package prototype.Banca.classes;

public class Cont implements IPrototype {
    private int codCont;
    private String dataDeschidereCont;

    public Cont(int codCont, String dataDeschidereCont) {
        this.codCont = codCont;
        this.dataDeschidereCont = dataDeschidereCont;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("codCont=").append(codCont);
        sb.append(", dataDeschidereCont='").append(dataDeschidereCont).append('\'');
        sb.append('}');
        return sb.toString();
    }

    private Cont() {
        super();
    }

    @Override
    public IPrototype copiaza() {
        IPrototype prototype = new Cont();
        ((Cont) prototype).codCont = this.codCont;
        ((Cont) prototype).dataDeschidereCont = this.dataDeschidereCont;
        return prototype;
    }
}
