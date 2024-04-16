package flyweight.main;

import flyweight.classes.Caracteristici;
import flyweight.classes.Fabrica;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica=new Fabrica();
        Caracteristici caracteristici1=new Caracteristici(13,45,"verde");
        Caracteristici caracteristici2=new Caracteristici(12,86,"rosu");
        Caracteristici caracteristici3=new Caracteristici(11,13,"albastru");
        Caracteristici caracteristici4=new Caracteristici(64,44,"mov");

        fabrica.getSpectator(10,10).deseneaza(caracteristici1);
        fabrica.getSpectator(20,10).deseneaza(caracteristici2);
        fabrica.getSpectator(10,10).deseneaza(caracteristici3);
        fabrica.getSpectator(20,10).deseneaza(caracteristici4);

    }
}
