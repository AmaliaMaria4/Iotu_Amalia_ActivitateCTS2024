package factoryMethod.Restaurant.classes;

public class FabricaSupaLegume implements IFabricaRestaurant{

    @Override
    public FeluriSupe creareSupa(String denumire, float gramaj, float pret) {
        return new SupaLegume(denumire,gramaj,pret);
    }
}
