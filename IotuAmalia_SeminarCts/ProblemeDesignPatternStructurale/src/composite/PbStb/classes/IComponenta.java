package composite.PbStb.classes;

public interface IComponenta {
    void adaugaComponenta(IComponenta comp);
    void stergeComponenta(IComponenta comp);
    void getComponenta(int index);
    void desceriere(String identare);
}
