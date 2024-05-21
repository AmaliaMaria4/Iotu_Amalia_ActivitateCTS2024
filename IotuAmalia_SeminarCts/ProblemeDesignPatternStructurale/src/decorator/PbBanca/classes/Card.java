package decorator.PbBanca.classes;

public class Card implements CardBancar{
    @Override
    public void efectueazaPlataOnline() {
        System.out.println("Plata online efectuata cu cardul.");

    }

    @Override
    public void efectueazaPlataNormala() {
        System.out.println("Plata normala efectuata cu cardul.");

    }
}
