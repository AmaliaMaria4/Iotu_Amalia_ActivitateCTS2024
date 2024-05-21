package proxy.PbRestaurant.main;

import proxy.PbRestaurant.classes.IRezervareMasa;
import proxy.PbRestaurant.classes.ProxyRezervare;
import proxy.PbRestaurant.classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervareMasa rezervareMasa1=new Rezervare(4,"Alex");
        IRezervareMasa rezervareMasa2=new Rezervare(2,"Andrei");
        rezervareMasa1.rezervaMasa();
        System.out.println();
        IRezervareMasa proxyRezervare1=new ProxyRezervare((Rezervare) rezervareMasa1);
        proxyRezervare1.rezervaMasa();
        IRezervareMasa proxyRezervare2=new ProxyRezervare((Rezervare) rezervareMasa2);
        proxyRezervare2.rezervaMasa();
    }
}
