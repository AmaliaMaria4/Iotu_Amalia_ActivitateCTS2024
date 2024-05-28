package chain.pbRestaurant.classes;

public class ManagerNotificari extends NotificatorBaza {
    @Override
    public void notifica(Client client, String oferta) {
        System.out.println("Nu s-au găsit date de contact pentru clientul " + client.getNume() + ". Notificare trimisă managerului restaurantului.");
    }

    @Override
    public void setSuccesor(Notificator emailNotificator) {

    }
}