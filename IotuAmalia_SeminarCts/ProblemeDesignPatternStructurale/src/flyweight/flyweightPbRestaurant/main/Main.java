package flyweight.flyweightPbRestaurant.main;

import flyweight.flyweightPbRestaurant.classes.Flyweight;
import flyweight.flyweightPbRestaurant.classes.FlyweightFactory;
import flyweight.flyweightPbRestaurant.classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(12, 2, 23);
        Rezervare rezervare2 = new Rezervare(3, 3, 12);
        Rezervare rezervare3 = new Rezervare(6, 4, 16);
        Rezervare rezervare4 = new Rezervare(8, 12, 11);
        Rezervare rezervare5 = new Rezervare(1, 5, 18);

        FlyweightFactory flyweightFactory=new FlyweightFactory();
        Flyweight client1=flyweightFactory.getFlyweight("0766290875");
        client1.printeazaRezervare(rezervare1);

        flyweightFactory.getFlyweight("053498").printeazaRezervare(rezervare2);
        flyweightFactory.getFlyweight("075342").printeazaRezervare(rezervare3);
        flyweightFactory.getFlyweight("053498").printeazaRezervare(rezervare4);
//
//        FlyweightFactory flyweightFactory=new FlyweightFactory();
//        Flyweight client1=flyweightFactory.getFlyweight("0766290875");
//        client1.printeazaRezervare("ion","0766","amalia.iotu@yahoo.com",rezervare1);
//        client1.printeazaRezervare("ion","0766","amalia.iotu@yahoo.com",rezervare2);

    }//2 clienti; 4 rezervari
}
