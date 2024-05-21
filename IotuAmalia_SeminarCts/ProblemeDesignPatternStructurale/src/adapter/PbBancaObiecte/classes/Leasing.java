package adapter.PbBancaObiecte.classes;

public class Leasing  {
    //noul framework
    private float suma;
    private String numeClient;

    public Leasing(float suma, String numeClient) {
        this.suma = suma;
        this.numeClient = numeClient;
    }

    public float getSuma() {
        return suma;
    }

    public String getNumeClient() {
        return numeClient;
    }

    //fac eu metode
    public void imprumuta(){
        System.out.println(this.numeClient+"  a realizat leasing cu suma de "+this.suma);
    }


}
