package proxy.PbBanca.main;

import proxy.PbBanca.classes.Credit;
import proxy.PbBanca.classes.CreditAbstract;
import proxy.PbBanca.classes.Proxy;
import proxy.PbBanca.classes.TipMoneda;

public class Main {
    public static void main(String[] args) {
        CreditAbstract credit=new Credit();
        credit.oferaCredit(TipMoneda.EUR,100);
        CreditAbstract proxy=new Proxy(credit);
        proxy.oferaCredit(TipMoneda.EUR,100);
        proxy.oferaCredit(TipMoneda.RON,500);
        proxy.oferaCredit(TipMoneda.USD,300);
        proxy.oferaCredit(TipMoneda.RON,700);
    }
}
