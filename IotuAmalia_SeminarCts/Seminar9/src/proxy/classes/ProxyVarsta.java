package proxy.classes;

public class ProxyVarsta implements Vanzare {
    private Vanzare vanzareBilet;
    private static int varstaMinima=14;
    public ProxyVarsta(Vanzare vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    public static void setVarstaMinima(int varstaMinima) {
        ProxyVarsta.varstaMinima = varstaMinima;
    }

    @Override
    public void vinde(Persoana persoana) {
        if(persoana.getVarsta()>=varstaMinima){
            vanzareBilet.vinde(persoana);
        }else{
            System.out.println("Persoana are varsta "+persoana.getVarsta()+" si nu poate achizitiona bilet.");
        }
    }
}
