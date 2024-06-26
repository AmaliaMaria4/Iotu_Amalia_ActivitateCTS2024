package flyweight.classes;

public class Spectator implements Flyweight{
    private int inaltime;
    private int latime;

    public Spectator(int inaltime, int latime) {
        this.inaltime = inaltime;
        this.latime = latime;
    }

    public int getInaltime() {
        return inaltime;
    }

    public int getLatime() {
        return latime;
    }

    @Override
    public void deseneaza(Caracteristici caracteristici) {
        System.out.println(this.toString()+caracteristici.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spectator{");
        sb.append("inaltime=").append(inaltime);
        sb.append(", latime=").append(latime);
        sb.append('}');
        return sb.toString();
    }
}
