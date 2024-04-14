package simpleFactory.Banca.main;


import simpleFactory.Banca.classes.Credit;
import simpleFactory.Banca.classes.FactoryCredit;
import simpleFactory.Banca.classes.TipCredit;

public class Main {
    public static void main(String[] args) {
        FactoryCredit factoryCredit=new FactoryCredit();
        try {
            Credit credit1=factoryCredit.createCredit(TipCredit.CREDITIPOTECAR,4224,242);
            Credit credit2=factoryCredit.createCredit(TipCredit.CREDITNEVOIPERSOANLE,144,64);
            credit1.afisareCredit();
            credit2.afisareCredit();
            System.out.println(credit1);
            System.out.println(credit2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
