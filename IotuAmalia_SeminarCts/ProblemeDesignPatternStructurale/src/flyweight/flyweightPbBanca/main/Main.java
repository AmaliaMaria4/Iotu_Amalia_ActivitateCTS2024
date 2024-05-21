package flyweight.flyweightPbBanca.main;

import flyweight.flyweightPbBanca.classes.ContClient;
import flyweight.flyweightPbBanca.classes.FlyweightFactory;
import flyweight.flyweightPbBanca.classes.ICont;

public class Main {
    public static void main(String[] args) {
        ContClient contClient1 = new ContClient(10, 234.5f);
        ContClient contClient2 = new ContClient(43, 543.42f);
        ContClient contClient3 = new ContClient(34, 264.12f);
        ContClient contClient4 = new ContClient(55, 756.5f);

        //flyweightFactory
        FlyweightFactory flyweight = new FlyweightFactory();
        //interfata
        ICont cont1 = flyweight.getFlyweight("0766408985");
        cont1.printeazaCont(contClient1);

        flyweight.getFlyweight("0711").printeazaCont(contClient2);
        flyweight.getFlyweight("0722").printeazaCont(contClient3);
        flyweight.getFlyweight("0711").printeazaCont(contClient4);
    }
}
