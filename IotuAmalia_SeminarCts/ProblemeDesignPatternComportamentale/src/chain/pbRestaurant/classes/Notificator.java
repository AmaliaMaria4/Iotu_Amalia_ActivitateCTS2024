package chain.pbRestaurant.classes;

public interface Notificator {
    void notifica(Client client, String oferta);

    void setSuccesor(Notificator emailNotificator);
}
