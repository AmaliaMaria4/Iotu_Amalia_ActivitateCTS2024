package simpleFactory.Banca.classes;

public class CreditIpotecar extends Credit {
    public CreditIpotecar(float suma, float dobanda) {
        super(suma, dobanda);
    }

   public void afisareCredit(){
       System.out.println("Creditul Ipotecar a fost acceptat");
   }
}
