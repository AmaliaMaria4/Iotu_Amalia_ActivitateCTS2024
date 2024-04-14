package simpleFactory.Spital.classes;

public class Medic implements IPersonalSpital{
    @Override
    public void descriere() {
        System.out.println("Acest angajat este un medic");
    }
}
