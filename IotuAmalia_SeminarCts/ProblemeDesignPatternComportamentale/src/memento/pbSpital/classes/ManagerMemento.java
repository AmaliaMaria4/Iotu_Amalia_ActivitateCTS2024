package memento.pbSpital.classes;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private final List<Memento> mementoList = new ArrayList<>();

    public void adaugaMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }

    public Memento getLastMemento() {
        if (!mementoList.isEmpty()) {
            return mementoList.get(mementoList.size() - 1);
        }
        return null;
    }
}
