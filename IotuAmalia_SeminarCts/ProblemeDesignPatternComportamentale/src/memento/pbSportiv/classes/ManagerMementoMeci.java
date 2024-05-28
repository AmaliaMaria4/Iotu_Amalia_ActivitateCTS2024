package memento.pbSportiv.classes;

import java.util.ArrayList;
import java.util.List;

public class ManagerMementoMeci {
    private List<MementoMeci> listaMemento=new ArrayList<>();

    public void adaugaMemento(MementoMeci mementoMeci){
        listaMemento.add(mementoMeci);
    }
    public void getMemento(int index){
        listaMemento.get(index);
    }
    public MementoMeci lastMemento(){
        MementoMeci mementoMeci=listaMemento.get(listaMemento.size()-1);
        return mementoMeci;
    }
}
