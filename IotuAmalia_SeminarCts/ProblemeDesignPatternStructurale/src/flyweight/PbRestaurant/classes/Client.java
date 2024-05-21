package flyweight.PbRestaurant.classes;



//daca zice sa se retina info cu privire la client=>cls client implementeaza interfata
public class Client implements Flyweight{
    private String nume;
    private String nrTel;
    private String email;

    public Client(String nume, String nrTel, String email) {
        this.nume = nume;
        this.nrTel = nrTel;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTel='").append(nrTel).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
       //si datele clientului si datele rezervarii
        System.out.println(this.toString()+rezervare.toString());
    }
}
