package composite.PbRestaurant.main;

import composite.PbRestaurant.classes.ComponentaMeniu;
import composite.PbRestaurant.classes.Element;
import composite.PbRestaurant.classes.Sectiune;

public class Main {
    public static void main(String[] args) throws Exception {
        ComponentaMeniu meniu=new Sectiune("meniu");
        ComponentaMeniu sectiuneBauturi=new Sectiune("bauturi");
        ComponentaMeniu sectiuneDesert=new Sectiune("desert");
        ComponentaMeniu elementCafea=new Element("cafea");
        ComponentaMeniu elementFrappe=new Element("frappe");
        ComponentaMeniu elementTiramisu=new Element("tiramisu");
        sectiuneBauturi.adaugaNod(elementCafea);
        sectiuneBauturi.adaugaNod(elementFrappe);

        sectiuneDesert.adaugaNod(elementTiramisu);
        meniu.adaugaNod(sectiuneDesert);

        meniu.adaugaNod(sectiuneBauturi);
        meniu.printeaza();

        sectiuneBauturi.stergeNod(elementFrappe);
        sectiuneDesert.adaugaNod(elementFrappe);
        meniu.printeaza();

    }
}
