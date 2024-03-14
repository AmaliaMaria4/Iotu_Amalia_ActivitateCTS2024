package simpleFactory.classes;

public class Asistent extends PersonalSpital{

    public Asistent(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisarePersonal() {
        System.out.println("Asistenul " +getNume()+ " este la spital.");
    }
}