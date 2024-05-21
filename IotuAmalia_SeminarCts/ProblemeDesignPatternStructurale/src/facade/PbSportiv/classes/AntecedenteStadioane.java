package facade.PbSportiv.classes;

public class AntecedenteStadioane {
    public boolean areAntecedente(String serieBuletin) {
        // Simulăm verificarea dacă persoana are antecedente pe alte stadioane
        return serieBuletin.endsWith("Antecedente");
    }
}
