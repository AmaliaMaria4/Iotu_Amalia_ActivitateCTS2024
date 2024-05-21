package flyweight.flyweightPbFarmacie.main;

import flyweight.flyweightPbFarmacie.classes.FlyweightFactory;
import flyweight.flyweightPbFarmacie.classes.IReteta;
import flyweight.flyweightPbFarmacie.classes.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta1=new Reteta(12,23.4f,2);
        Reteta reteta2=new Reteta(22,12.4f,3);
        Reteta reteta3=new Reteta(35,27,1);
        Reteta reteta4=new Reteta(3,40,6);

        FlyweightFactory flyweightFactory=new FlyweightFactory();
        IReteta client1=flyweightFactory.getFlyweight(136);
        client1.printeazaReteta(reteta1);

        flyweightFactory.getFlyweight(12).printeazaReteta(reteta2);
        flyweightFactory.getFlyweight(13).printeazaReteta(reteta3);
        flyweightFactory.getFlyweight(12).printeazaReteta(reteta4);
    }
}
