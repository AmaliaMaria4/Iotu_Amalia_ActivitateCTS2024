package chain.pbRestaurant.classes;

public class EmailNotificator extends NotificatorBaza {
    @Override
    public void notifica(Client client, String oferta) {
        if (client.getEmail() != null && !client.getEmail().isEmpty()) {
            System.out.println("Notificare email trimisă către " + client.getNume() + " la adresa de email " + client.getEmail() + ": " + oferta);
        } else {
            super.trimiteNotificare(client, oferta);
        }
    }

    @Override
    public void setSuccesor(Notificator emailNotificator) {

    }
}