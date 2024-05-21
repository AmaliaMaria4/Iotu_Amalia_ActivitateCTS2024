package decorator.PbRestaurant.classes;

public class DecoratorNotaPasteFericit extends DecoratorAbstract{
    public DecoratorNotaPasteFericit(NotaAbstracta nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felicitare Paste Fericit");
    }
    public void printeaza(){
        //apelez din parinte cu 'super', adica pastrez functionalitatea,doar adaug
        super.printeaza();
        System.out.println("Paste Fericit");
    }
}
