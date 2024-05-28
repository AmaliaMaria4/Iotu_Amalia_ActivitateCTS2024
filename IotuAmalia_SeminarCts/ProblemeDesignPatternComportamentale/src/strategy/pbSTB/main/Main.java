package strategy.pbSTB.main;

import strategy.pbSTB.classes.Calator;
import strategy.pbSTB.classes.CardCalatorii;
import strategy.pbSTB.classes.Sms;

public class Main {
    public static void main(String[] args) {
        Calator calator1=new Calator("Andrei",23,"060102033336139",new Sms());
        calator1.getMetodaPlata().plataCalatorie();
        calator1.setMetodaPlata(new CardCalatorii());
        calator1.getMetodaPlata().plataCalatorie();
    }
}
