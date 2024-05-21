package decorator.PbBanca.classes;

public class DecoratorContactLess extends DecoratorCard{
    public DecoratorContactLess(CardBancar card) {
        super(card);
    }
    @Override
    public void efectueazaPlataOnline() {
        card.efectueazaPlataOnline();
    }

    @Override
    public void efectueazaPlataNormala() {
        card.efectueazaPlataNormala();
    }


}
