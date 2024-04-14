package factoryMethod.Restaurant.classes;

public class FabricaSupaCiuperci implements IFabricaRestaurant {

    @Override
    public FeluriSupe creareSupa(String denumire, float gramaj, float pret) {
        return new SupaCiuperci(denumire,gramaj,pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FabricaSupaCiuperci{");
        sb.append('}');
        return sb.toString();
    }
}
