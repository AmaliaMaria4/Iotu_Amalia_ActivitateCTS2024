package simpleFactory.Farmacie.classes;

public class Body implements ICategorieMedicamente{
    @Override
    public void descriere() {
        System.out.println("Acesta este un medicament pt body!");
    }
}
