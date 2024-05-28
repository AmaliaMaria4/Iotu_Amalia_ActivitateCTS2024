package chain.pbRestaurant.main;

import chain.pbRestaurant.classes.*;

public class Main {
    public static void main(String[] args) {
        // Creare clienți cu diferite date de contact
        Client client1 = new Client("John", "123456789", "john@example.com");
        Client client2 = new Client("Alice", null, "alice@example.com");
        Client client3 = new Client("Bob", "987654321", null);
        Client client4 = new Client("David", null, null);

        // Creare notificatori
        Notificator smsNotificator = new SMSNotificator();
        Notificator emailNotificator = new EmailNotificator();
        Notificator managerNotificari = new ManagerNotificari();

        // Configurare lanț de responsabilitate
        smsNotificator.setSuccesor(emailNotificator);
        emailNotificator.setSuccesor(managerNotificari);

        // Trimitere notificări pentru fiecare client
        smsNotificator.notifica(client1, "Ofertă specială: 10% reducere pentru clienții fideli!");
        smsNotificator.notifica(client2, "Ofertă specială: 10% reducere pentru clienții fideli!");
        smsNotificator.notifica(client3, "Ofertă specială: 10% reducere pentru clienții fideli!");
        smsNotificator.notifica(client4, "Ofertă specială: 10% reducere pentru clienții fideli!");
    }
}