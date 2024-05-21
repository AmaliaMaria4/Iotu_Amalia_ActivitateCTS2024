package flyweight.PbRestaurant.main;

import flyweight.PbRestaurant.classes.FlyweightFactory;
import flyweight.PbRestaurant.classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1=new Rezervare(5,3,17);
        Rezervare rezervare2=new Rezervare(4,2,18);
        Rezervare rezervare3=new Rezervare(2,7,18);

        //clientii ii fac prin fabrica
        FlyweightFactory factory=new FlyweightFactory();
        factory.getClient("0733948204").printeazaRezervare(rezervare1);
        factory.getClient("0458394023").printeazaRezervare(rezervare2);
        factory.getClient("4534235243").printeazaRezervare(rezervare3);
        //afisez cu 'printeaza'

    }
}
