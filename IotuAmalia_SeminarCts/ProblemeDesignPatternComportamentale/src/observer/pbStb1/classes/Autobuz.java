package observer.pbStb1.classes;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements IAutobuz {
    private int linie;
    private List<ICalator> calatorList = new ArrayList<>();

    public Autobuz(int linie) {
        this.linie = linie;
    }

    @Override
    public void adaugaCalator(ICalator calator) {
        calatorList.add(calator);
    }

    @Override
    public void stergeCalator(ICalator calator) {
        calatorList.remove(calator);
    }

    @Override
    public void trimiteNotificare(String notificare) {
        for(var calator: calatorList){
            calator.receptioneazNotificare(notificare);
        }
    }
}
