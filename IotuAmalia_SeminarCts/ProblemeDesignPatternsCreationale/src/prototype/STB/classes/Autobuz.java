package prototype.STB.classes;

public class Autobuz implements IPrototype {
    private String numarInmatriculare;

    public Autobuz() {
        super();
    }

    public Autobuz(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numarInmatriculare='").append(numarInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IPrototype copiaza() {
        IPrototype prototype = new Autobuz();
        ((Autobuz) prototype).numarInmatriculare = this.numarInmatriculare;
        return prototype;
    }
}