package facade.PbBanca.classes;

public class BirouCredite {
    public static boolean areDatorii(Persoana persoana){
        if(Integer.parseInt(""+persoana.getCnp().charAt(12))%2==0){
            return false;
        }
        return true;
    }
}
