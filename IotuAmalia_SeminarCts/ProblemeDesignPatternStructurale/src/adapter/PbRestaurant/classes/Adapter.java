package adapter.PbRestaurant.classes;

public class Adapter implements IBucatarie{
    private Bar bar;
    @Override
    public void printeazaFactura() {
        bar.cheamaOspatar();      //de obiecte
    }

    public Adapter(Bar bar) {
        this.bar = bar;
    }
}
//adapter de clase: implementeaza clasa cu care eu stiu sa lucrez, extinde noua clasa
//adapter de clase: implementeaza clasa cu care eu stiu sa lucrez, iau un obiect de tipul clase nou achizitionate
