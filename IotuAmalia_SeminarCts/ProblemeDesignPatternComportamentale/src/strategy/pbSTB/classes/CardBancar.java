package strategy.pbSTB.classes;

public class CardBancar implements IMetodaPlata{
    @Override
    public void plataCalatorie() {
        System.out.println("calatorul a platit calatoria cu cardul bancar");
    }
}
