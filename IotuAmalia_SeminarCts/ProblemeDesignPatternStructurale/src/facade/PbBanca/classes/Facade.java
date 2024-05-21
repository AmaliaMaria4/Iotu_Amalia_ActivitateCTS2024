package facade.PbBanca.classes;

public class Facade {
    public static boolean esteEligibil(Persoana persoana){
        if(persoana.getVarsta()>=18){
            Politie politie=new Politie();
            if(!politie.esteUrmarita(persoana)){
                if(!BirouCredite.areDatorii(persoana)){
                    return true;
                }
            }
        }
        return false;
    }
}
