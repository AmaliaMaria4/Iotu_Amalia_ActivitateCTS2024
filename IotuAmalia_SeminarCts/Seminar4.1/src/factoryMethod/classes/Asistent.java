package factoryMethod.classes;

public class Asistent extends PersonalSpital {

    public Asistent(String nume, int salariu) {
        super(nume, salariu);
    }
    public void afisareAngajati() {
        System.out.println("Asistenul " +getNume()+ " este la spital.");
    }

}
