package decorator.PbRestaurant.classes;


//trb sa fac clasa abstracta
public abstract class DecoratorAbstract implements NotaAbstracta {
    private NotaAbstracta nota;

    public DecoratorAbstract(NotaAbstracta nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza() {
        nota.printeaza();
    }
    public abstract void printeazaFelicitare();
}
