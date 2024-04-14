package prototype.Banca.main;

import prototype.Banca.classes.Client;
import prototype.Banca.classes.Cont;

public class Main {
    public static void main(String[] args) {
    Client client1=new Client(1234,"Popescu Mihai","6010202123123","RNCB247825925");
    Client client2=new Client(4567,"Grigore Ana","6020101341234","RNCB980234091");
    Client client3= (Client) client1.copiaza();
    Client client4= (Client) client2.copiaza();
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println(client4);


        Cont cont1=new Cont(424,"12.04.2023");
        Cont cont2= (Cont) cont1.copiaza();
        System.out.println(cont1);
        System.out.println(cont2);
    }
}
