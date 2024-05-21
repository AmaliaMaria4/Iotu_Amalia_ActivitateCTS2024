package composite.PbSportiv.classes;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ILocSpectator{
    private String denumire;
    private List<ILocSpectator> subsectiuni;

    public Sectiune(String denumire) {
        this.denumire = denumire;
        this.subsectiuni = new ArrayList<>();
    }

    @Override
    public void adaugaLoc(ILocSpectator locSpectator) {
        subsectiuni.add(locSpectator);
    }

    @Override
    public void stergeLoc(ILocSpectator locSpectator) {
        subsectiuni.remove(locSpectator);
    }

    @Override
    public void descriere() {
        System.out.println("Sectiune: " + denumire);
        for (ILocSpectator locSpectator : subsectiuni) {
            locSpectator.descriere();
        }
    }
}
