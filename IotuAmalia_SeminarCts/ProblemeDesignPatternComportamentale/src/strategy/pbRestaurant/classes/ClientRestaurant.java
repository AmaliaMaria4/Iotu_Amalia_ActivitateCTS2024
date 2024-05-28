package strategy.pbRestaurant.classes;

public class ClientRestaurant {
    private IMetodaPlata metodaPlata;
    private String nume;

    public ClientRestaurant(IMetodaPlata metodaPlata, String nume) {
        this.metodaPlata = metodaPlata;
        this.nume = nume;
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    //    public void efectueazaPlata(float suma) {
//        if (metodaPlata == null) {
//            System.out.println("Nu a fost setată nicio metodă de plată.");
//            return;
//        }
//        metodaPlata.plateste(suma);
//    }
    public void efectueazaPlata(float suma) {
        System.out.println(nume + " are de plata " + suma + " lei");
       metodaPlata.plateste(suma);
    }

}

