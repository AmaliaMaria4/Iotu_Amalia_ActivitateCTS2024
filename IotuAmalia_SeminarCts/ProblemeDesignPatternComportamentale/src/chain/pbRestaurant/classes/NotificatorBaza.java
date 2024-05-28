package chain.pbRestaurant.classes;

public abstract class NotificatorBaza implements Notificator {
    private NotificatorBaza succesor;

    public void setSuccesor(NotificatorBaza succesor) {
        this.succesor = succesor;
    }

    public void trimiteNotificare(Client client, String oferta) {
        if (succesor != null) {
            succesor.notifica(client, oferta);
        }
    }
}