package composite.PbSpital.classes;

public interface IDepartament {
    void adaugaSubdepartament(IDepartament subdepartament);
    void stergeSubdepartament(IDepartament subdepartament);
    void descriere(String identare);
}
