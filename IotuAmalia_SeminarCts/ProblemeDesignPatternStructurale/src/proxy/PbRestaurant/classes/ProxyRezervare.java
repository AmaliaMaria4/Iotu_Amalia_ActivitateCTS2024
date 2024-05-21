package proxy.PbRestaurant.classes;

public class ProxyRezervare implements IRezervareMasa {
    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

//    public Rezervare getRezervare() {
//        return rezervare;
//    }

    @Override
    public void descriere() {
       rezervare.descriere();
    }

    @Override
    public void rezervaMasa() {
        if (rezervare.getNrPersoane() >= 4) {
            //System.out.println("S-a rezervat masa");
            rezervare.rezervaMasa();
        } else {
            System.out.println("Sunt prea putine persoane");
        }
    }
}
