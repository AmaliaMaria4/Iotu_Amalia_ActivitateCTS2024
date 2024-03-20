package factoryMethod.classes;

public class Infirmier extends PersonalSpital {

    public Infirmier(String nume, int salariu) {
        super(nume, salariu);
    }

    public void afisareAngajati() {
        System.out.println("Infirmierul " +getNume()+ " este la spital.");
    }
}
