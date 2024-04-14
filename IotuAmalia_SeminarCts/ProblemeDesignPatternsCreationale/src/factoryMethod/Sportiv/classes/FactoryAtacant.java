package factoryMethod.Sportiv.classes;

public class FactoryAtacant implements FactoryJucator{

    @Override
    public Jucator getJucator(String nume, int varsta, float inaltime, int nrTicouAtacant, int nrTricouFundas, int nrTricouPortar) {
        return new Atacant(nume,varsta,inaltime,nrTicouAtacant);
    }
}
