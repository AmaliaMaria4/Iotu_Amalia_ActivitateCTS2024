package flyweight.flyweightPbBanca.classes;

public class Banca {
    private String numeBanca;
    private String sucursala;
    private float capital;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banca{");
        sb.append("numeBanca='").append(numeBanca).append('\'');
        sb.append(", sucursala='").append(sucursala).append('\'');
        sb.append(", capital=").append(capital);
        sb.append('}');
        return sb.toString();
    }

    public Banca(String numeBanca, String sucursala, float capital) {
        this.numeBanca = numeBanca;
        this.sucursala = sucursala;
        this.capital = capital;

    }
}
