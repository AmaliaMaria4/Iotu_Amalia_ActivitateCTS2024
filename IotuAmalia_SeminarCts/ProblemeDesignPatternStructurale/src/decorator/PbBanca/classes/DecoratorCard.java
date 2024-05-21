package decorator.PbBanca.classes;

public abstract class DecoratorCard implements CardBancar {
    protected CardBancar card;

    public DecoratorCard(CardBancar card) {
        this.card = card;
    }

    @Override
    public void efectueazaPlataOnline() {
        card.efectueazaPlataOnline();
    }

    @Override
    public void efectueazaPlataNormala() {
        card.efectueazaPlataNormala();
    }
    public void efectueazaPlataContactLess() {
        System.out.println("Plata ContactLess efectuata cu cardul.");
    }
}
