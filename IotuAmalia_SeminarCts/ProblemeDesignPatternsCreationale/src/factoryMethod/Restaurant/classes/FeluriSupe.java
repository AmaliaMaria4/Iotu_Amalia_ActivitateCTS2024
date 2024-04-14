package factoryMethod.Restaurant.classes;

public abstract class FeluriSupe {
    private String denumire;
    private float gramaj;
    private float pret;

    public FeluriSupe(String denumire, float gramaj, float pret) {
        this.denumire = denumire;
        this.gramaj = gramaj;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FeluriSupe{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
