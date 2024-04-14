package prototype.Restaurant.main;

import prototype.Restaurant.classes.ContClient;
import prototype.Restaurant.classes.IPrototype;

public class Main {
    public static void main(String[] args) {
        IPrototype client1=new ContClient("Iotu Amalia","0766408985");
        IPrototype client2=client1.copiaza();
        System.out.println(client1);
        System.out.println(client2);

    }
}
