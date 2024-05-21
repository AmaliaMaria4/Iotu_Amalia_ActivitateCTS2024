package decorator.PbRestaurant.classes;

public class DecoratorLaMultiAni extends DecoratorAbstract{
    public DecoratorLaMultiAni(NotaAbstracta nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felicitare La multi ani");
    }
//    public void printeaza(){
//        //apelez din parinte cu 'super', adica pastrez functionalitatea,doar adaug
//        super.printeaza();
//        System.out.println("La multi ani");
//    }
}
