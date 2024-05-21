package facade.PbSportiv.classes;

public class FacadeStadion {
    private Persoana persoana;
    private Politie politie;
    private AntecedenteStadioane antecedenteStadioane;

    public FacadeStadion(Persoana persoana, Politie politie, AntecedenteStadioane antecedenteStadioane) {
        this.persoana = persoana;
        this.politie = politie;
        this.antecedenteStadioane = antecedenteStadioane;
    }

    public void verificaPersoana() {
        System.out.println("Verificare persoana cu seria buletin " + persoana.getSerieBuletin()
                + " și codul bilet " + persoana.getCodBilet() + ":");

        if (politie.persoanaCautata(persoana.getSerieBuletin())) {
            System.out.println("Persoana este căutată de poliție!");
        } else {
            System.out.println("Persoana nu este căutată de poliție.");

            if (antecedenteStadioane.areAntecedente(persoana.getSerieBuletin())) {
                System.out.println("Persoana are antecedente pe alte stadioane.");
            } else {
                System.out.println("Persoana nu are antecedente pe alte stadioane.");
            }
        }
    }
}
