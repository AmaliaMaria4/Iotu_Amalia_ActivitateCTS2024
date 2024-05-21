package composite.PbSpital.classes;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IDepartament{
    private String denumire;
    private List<IDepartament> subdepartamente;

    public Departament(String denumire) {
        this.denumire = denumire;
        this.subdepartamente = new ArrayList<>();
    }

    @Override
    public void adaugaSubdepartament(IDepartament subdepartament) {
        subdepartamente.add(subdepartament);
    }

    @Override
    public void stergeSubdepartament(IDepartament subdepartament) {
        subdepartamente.remove(subdepartament);
    }

    @Override
    public void descriere(String identare) {
        System.out.println(identare+"Departament: " + denumire);
        for (IDepartament subdepartament : subdepartamente) {
            subdepartament.descriere(identare+" ");
        }
    }
}
