package facade.PbSportiv.classes;

public class Politie {
    public boolean persoanaCautata(String serieBuletin) {
        // Simulăm verificarea dacă persoana este căutată de poliție
        return serieBuletin.startsWith("Cautat");
    }
}
