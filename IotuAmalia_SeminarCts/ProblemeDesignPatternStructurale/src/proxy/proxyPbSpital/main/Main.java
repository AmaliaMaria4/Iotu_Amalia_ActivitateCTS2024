package proxy.proxyPbSpital.main;

import proxy.proxyPbSpital.classes.IInternareSpital;
import proxy.proxyPbSpital.classes.Internare;
import proxy.proxyPbSpital.classes.ProxyInternare;

public class Main {
    public static void main(String[] args) {
        IInternareSpital internare1 = new Internare(true, "Maria");
        IInternareSpital internare2 = new Internare(false, "Ion");

        IInternareSpital proxyInternare1 = new ProxyInternare((Internare) internare1);
        proxyInternare1.descriere();
        proxyInternare1.internare();

        IInternareSpital proxyInternare2 = new ProxyInternare((Internare) internare2);
        proxyInternare2.descriere();
        proxyInternare2.internare();
    }
}
