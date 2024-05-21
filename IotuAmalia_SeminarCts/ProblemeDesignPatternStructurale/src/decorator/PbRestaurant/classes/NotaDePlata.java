package decorator.PbRestaurant.classes;

public class NotaDePlata implements NotaAbstracta{
    private float suma;

    public NotaDePlata(float suma) {
        this.suma = suma;
    }

    @Override
    public void printeaza() {
        System.out.println("suma este "+suma);
    }
}
