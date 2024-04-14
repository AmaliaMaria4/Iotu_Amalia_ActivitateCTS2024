package simpleFactory.Restaurant.classes;

public class FabricaRestaurant {
    public IMeniu createObject(TipSupe supe) throws Exception{
        switch (supe){
            case supaLegume:
                return new SupaLegume();
            case supaCiuperci:
                return new SupaCiuperci();
            case supaVita:
                return new SupaVita();

            default:
                throw new Exception("Tipul nu este definit");
        }
    }

}
