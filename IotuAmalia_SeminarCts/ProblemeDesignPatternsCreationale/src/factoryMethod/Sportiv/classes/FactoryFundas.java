package factoryMethod.Sportiv.classes;

public class FactoryFundas implements FactoryJucator{

    @Override
    public Jucator getJucator(String nume, int varsta, float inaltime, int nrTicouAtacant, int nrTricouFundas, int nrTricouPortar) {
        return new Fundas(nume,varsta,inaltime,nrTricouFundas);
    }
}
