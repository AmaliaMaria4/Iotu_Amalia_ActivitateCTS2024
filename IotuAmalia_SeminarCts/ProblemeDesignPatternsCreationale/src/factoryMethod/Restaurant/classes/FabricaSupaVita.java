package factoryMethod.Restaurant.classes;

public class FabricaSupaVita implements IFabricaRestaurant{

    @Override
    public FeluriSupe creareSupa(String denumire, float gramaj, float pret) {
        return new SupaVita(denumire,gramaj,pret);
    }
}
