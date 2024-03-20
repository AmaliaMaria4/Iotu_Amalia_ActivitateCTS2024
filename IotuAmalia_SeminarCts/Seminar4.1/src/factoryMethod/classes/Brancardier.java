package factoryMethod.classes;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume, int salariu) {
        super(nume, salariu);
    }
    public void afisareAngajati() {
        System.out.println("Brancardierul " +getNume()+ " este la spital.");
    }
}
