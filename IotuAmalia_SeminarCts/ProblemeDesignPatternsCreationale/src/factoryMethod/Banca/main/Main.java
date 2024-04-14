package factoryMethod.Banca.main;


import factoryMethod.Banca.classes.Clienti;
import factoryMethod.Banca.classes.FabricaPersoaneFizice;
import factoryMethod.Banca.classes.FabricaPersoaneJuridice;
import factoryMethod.Banca.classes.IBanca;

public class Main {

    public static void afisare(IBanca fabricaBanca, String nume, String nrTelefon, long cnp){
        Clienti clienti=fabricaBanca.createClient(nume,nrTelefon,cnp);
        System.out.println(clienti.toString());
    }
    public static void main(String[] args) {
        afisare(new FabricaPersoaneFizice(),"Ionescu Ana","0766408903",0766442323);
        afisare(new FabricaPersoaneJuridice(),"Kaufland","0762029301",324233423);
    }
}
