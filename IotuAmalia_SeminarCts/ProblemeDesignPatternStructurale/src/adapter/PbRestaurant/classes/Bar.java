package adapter.PbRestaurant.classes;

import java.util.List;

public class Bar implements IBar{
    private String numeOspatar;
    private List<String> denumiriBauturi;


    public void cheamaOspatar() {
        System.out.println("Barmanul a fost chemat");
    }

    public Bar(String numeOspatar, List<String> denumiriBauturi) {
        this.numeOspatar = numeOspatar;
        this.denumiriBauturi = denumiriBauturi;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bar{");
        sb.append("numeOspatar='").append(numeOspatar).append('\'');
        sb.append(", denumiriBauturi=").append(denumiriBauturi);
        sb.append('}');
        return sb.toString();
    }
}
