package composite.PbSpital.classes;

public class Sectie implements IDepartament{
    private String denumire;

    public Sectie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaSubdepartament(IDepartament subdepartament) {
        // Nu se adaugă subdepartamente pentru secții
        System.out.println("Nu se pot adăuga subdepartamente la o secție.");
    }

    @Override
    public void stergeSubdepartament(IDepartament subdepartament) {
        // Nu se șterg subdepartamente pentru secții
        System.out.println("O secție nu poate avea subdepartamente.");
    }

    @Override
    public void descriere(String identare) {
        System.out.println(identare+ " Sectie: " + denumire);
    }
}
