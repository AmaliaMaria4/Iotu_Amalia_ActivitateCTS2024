package simpleFactory.classes;

public class Brancardier extends PersonalSpital{


    public Brancardier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisarePersonal() {
        System.out.println("Brancardierul " +getNume()+ " este la spital.");
    }
}
