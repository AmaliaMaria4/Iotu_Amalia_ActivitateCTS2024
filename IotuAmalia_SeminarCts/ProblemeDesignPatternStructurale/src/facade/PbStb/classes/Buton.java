package facade.PbStb.classes;

public class Buton {
    private Usa usa;

    public Buton(Usa usa) {
        this.usa = usa;
    }

    public Usa getUsa() {
        return usa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Buton{");
        sb.append("usa=").append(usa);
        sb.append('}');
        return sb.toString();
    }
}
