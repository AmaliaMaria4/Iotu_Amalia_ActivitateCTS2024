package proxy.PbSportiv.classes;

public class Proxy implements IVanzareBilete {
    private IVanzareBilete vanzareBilet;
    private static int varstaMinima=14;

    public Proxy(IVanzareBilete vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    @Override
    public void vindeBilet(Persoana persoana) {
        if(persoana.getVarsta()>=varstaMinima){
            vanzareBilet.vindeBilet(persoana);
            System.out.println("poate sa ia bilete!!!!!");
        }else{
            System.out.println("persoana are varsta "+persoana.getVarsta()+"deci este sub 14 ani");
        }
    }




}
