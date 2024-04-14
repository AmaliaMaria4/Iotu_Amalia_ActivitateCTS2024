package factoryMethod.Sportiv.classes;

public interface FactoryJucator {
    Jucator getJucator(String nume,int varsta,float inaltime,int nrTicouAtacant,int nrTricouFundas,int nrTricouPortar);
}
