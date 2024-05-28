package strategy.pbSpital.classes;

public class PlataCash implements IMetodaPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Plata cash în valoare de " + suma + " lei a fost efectuată.");
    }
}
