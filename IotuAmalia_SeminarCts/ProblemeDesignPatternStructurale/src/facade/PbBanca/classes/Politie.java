package facade.PbBanca.classes;

public class Politie {
    public boolean esteUrmarita(Persoana persoana) {
        if (Integer.parseInt("" + persoana.getCnp().charAt(11)) % 2 == 0) {
            return false;
        }
        return true;
    }
}
