package flyweight.flyweightPbSpital.classes;

import java.util.HashMap;

public class FabricaDeSaloane {
    private  HashMap<String, ISalon> saloane = new HashMap<>();

    //    public  ISalon getSalon(int nrSalon, int nrPat, int nrZileSpitalizare){
//        if(saloane.containsKey(nrSalon)){
//            return saloane.get(nrSalon);
//        }else{
//            ISalon salon=new Salon(nrSalon,nrPat,nrZileSpitalizare);
//            saloane.put(nrSalon,salon);
//            return salon;
//        }
//    }
//    public static ISalon getSalon(String nume, String numarTelefon, String adresa) {
//        String cheie = nume + numarTelefon; // Cheia unică pentru fiecare pacient
//        if (!saloane.containsKey(cheie)) {
//            Pacient pacient = new Pacient(nume, numarTelefon, adresa);
//            saloane.put(cheie, pacient);
//        }
//        return saloane.get(cheie);
//    }
    public ISalon getSalon(String nume){
        ISalon salon=saloane.get(nume);
        if(salon==null){
            salon=new Pacient(nume,"0399","barca");
            saloane.put(nume,salon);
        }
        return salon;
    }
}
