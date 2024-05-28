package strategy.pbSTB.classes;

public class Sms implements IMetodaPlata{
    @Override
    public void plataCalatorie() {
        System.out.println("calatorul a platit calatoria prin sms");
    }
}
