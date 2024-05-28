package chain.pbRestaurant.classes;

public class SMSNotificator extends NotificatorBaza {
    @Override
    public void notifica(Client client, String oferta) {
        if (client.getNumarTelefon() != null && !client.getNumarTelefon().isEmpty()) {
            System.out.println("Notificare SMS trimisă către " + client.getNume() + " la numărul de telefon " + client.getNumarTelefon() + ": " + oferta);
        } else {
            super.trimiteNotificare(client, oferta);
        }
    }

    @Override
    public void setSuccesor(Notificator emailNotificator) {

    }
}
