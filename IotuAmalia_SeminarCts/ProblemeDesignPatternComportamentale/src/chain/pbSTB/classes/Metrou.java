package chain.pbSTB.classes;

public class Metrou extends MijlocTransport {
    @Override
    public void notifica(Calator calator) {
        if(calator.getDistanta()>10){
            System.out.println("poti sa folosesti metroul!");
        }
    }
}
