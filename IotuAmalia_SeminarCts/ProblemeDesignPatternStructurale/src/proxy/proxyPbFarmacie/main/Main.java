package proxy.proxyPbFarmacie.main;

import proxy.proxyPbFarmacie.classes.CumparareMedicamente;
import proxy.proxyPbFarmacie.classes.ICumparareMedicamente;
import proxy.proxyPbFarmacie.classes.ProxyCumparareMedicamente;

public class Main {
    public static void main(String[] args) {
        ICumparareMedicamente cumparare1 = new CumparareMedicamente(true, "Ana");
        ICumparareMedicamente cumparare2 = new CumparareMedicamente(false, "Mihai");
cumparare1.cumparaMedicamente();
cumparare2.cumparaMedicamente();
        ICumparareMedicamente proxyCumparare1 = new ProxyCumparareMedicamente((CumparareMedicamente) cumparare1);
        ICumparareMedicamente proxyCumparare2 = new ProxyCumparareMedicamente((CumparareMedicamente) cumparare2);
       // proxyCumparare1.descriere();
        proxyCumparare1.cumparaMedicamente();
        proxyCumparare2.cumparaMedicamente();

//        ICumparareMedicamente proxyCumparare2 = new ProxyCumparareMedicamente((CumparareMedicamente) cumparare2);
//        proxyCumparare2.descriere();
//        proxyCumparare2.cumparaMedicamente();
    }
}