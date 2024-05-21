package decorator.PbRestaurant.main;

import decorator.PbRestaurant.classes.DecoratorAbstract;
import decorator.PbRestaurant.classes.DecoratorNotaPasteFericit;
import decorator.PbRestaurant.classes.NotaAbstracta;
import decorator.PbRestaurant.classes.NotaDePlata;

public class Main {
    public static void main(String[] args) {
        //daca clasa e abstracta, nu pot sa fac new tot de clasa aia,
        NotaAbstracta notaAbstracta=new NotaDePlata(100);
        notaAbstracta.printeaza();
        DecoratorAbstract decoratorAbstract=new DecoratorNotaPasteFericit(notaAbstracta);
        //decoratorAbstract.printeazaFelicitare();
        decoratorAbstract.printeaza();

        System.out.println();
//
//        DecoratorAbstract decoratorLMA=new DecoratorLaMultiAni(notaAbstracta);
//        decoratorLMA.printeaza();
//
//        //decorare multipla si lma si paste ferisit
//        NotaAbstracta notaNoua=new NotaDePlata(36);
//        DecoratorAbstract decoratorLMA1=new DecoratorLaMultiAni(notaNoua);
//        DecoratorAbstract decoratorPaste=new DecoratorNotaPasteFericit(decoratorLMA1);
//        System.out.println();
//        decoratorPaste.printeaza();
    }
}
