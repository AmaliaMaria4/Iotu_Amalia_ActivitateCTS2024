package composite.PbStb.classes;

import java.util.ArrayList;
import java.util.List;

public class AutobuzComposite implements IComponenta {
    private String descriere;
    private List<IComponenta> lista = new ArrayList<>();

    public AutobuzComposite(String descriere) {
        this.descriere = descriere;
    }

    @Override
    public void adaugaComponenta(IComponenta comp) {
        lista.add(comp);
    }

    @Override
    public void stergeComponenta(IComponenta comp) {
        lista.remove(comp);
    }

    @Override
    public void getComponenta(int index) {
        lista.get(index);
    }


    @Override
    public void desceriere(String identare) {
        System.out.println(identare+"Grup: "+this.descriere);
        for(var comp: lista){
            comp.desceriere(identare+" ");
        }
    }
}
