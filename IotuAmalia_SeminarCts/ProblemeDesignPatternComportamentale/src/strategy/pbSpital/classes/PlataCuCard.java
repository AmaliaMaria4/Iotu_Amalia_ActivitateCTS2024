package strategy.pbSpital.classes;

public class PlataCuCard implements IMetodaPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Plata cu cardul în valoare de " + suma + " lei a fost efectuată.");
    }
}
