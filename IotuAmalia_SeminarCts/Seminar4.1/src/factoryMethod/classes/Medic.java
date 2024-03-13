package factoryMethod.classes;

public class Medic extends PersonalSpital {

    public Medic(String nume, int salariu) {
        super(nume, salariu);
    }
    public void afisareAngajati() {
        System.out.println("Medicul " +getNume()+ " este la spital.");
    }
}
