package factoryMethod.Restaurant.main;

import factoryMethod.Restaurant.classes.*;

public class Main {
    public static void afisare(IFabricaRestaurant fabricaRestaurant, String denumire,float gramaj,float pret) {
        FeluriSupe feluriSupe = fabricaRestaurant.creareSupa(denumire,gramaj,pret);
        System.out.println(feluriSupe.toString());
    }

    public static void main(String[] args) {
       afisare(new FabricaSupaCiuperci(),"supa ciuperci",12.3f,12.3f);
       afisare(new FabricaSupaLegume(),"supa legume",14,20);
       afisare(new FabricaSupaVita(),"supa vita",21,41);
    }
}
