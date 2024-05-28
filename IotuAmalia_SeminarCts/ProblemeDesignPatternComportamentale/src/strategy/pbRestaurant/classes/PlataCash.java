package strategy.pbRestaurant.classes;

public class PlataCash implements IMetodaPlata{
    private float sumaDisponibila;

    public PlataCash(float sumaDisponibila) {
      this.sumaDisponibila = sumaDisponibila;
    }

    @Override
    public void plateste(float suma) {
        if (sumaDisponibila >= suma) {
            System.out.println("Plata cash în valoare de " + suma + " lei a fost efectuată.");
            sumaDisponibila -= suma;
            return;
        }
        System.out.println("fonduri insuficiente!");
    }
}
