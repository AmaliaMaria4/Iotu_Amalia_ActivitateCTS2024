package flyweight.flyweightPbRestaurant.classes;

public class Client implements Flyweight {
    private String nume;
    private String nrTelefon;
    private String email;

    public Client(String nume, String nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println("Nume: " + this.nume + " ,Nr tel: " + nrTelefon + " ,Email: " + email + " ,Rezaervarea: " + rezervare.toString());
    }

//    @Override
//    public void printeazaRezervare(Rezervare rezervare) {
//        //printez info din client si info din rezervare
//        System.out.println(this.toString() + "" + rezervare.toString());
//    }
}
