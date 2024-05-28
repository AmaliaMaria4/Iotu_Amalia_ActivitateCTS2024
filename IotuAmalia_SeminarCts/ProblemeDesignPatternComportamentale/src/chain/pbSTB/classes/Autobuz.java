package chain.pbSTB.classes;

public class Autobuz extends MijlocTransport{
    @Override
    public void notifica(Calator calator) {
        if(calator.getDistanta()>3&&calator.getDistanta()<5){
            System.out.println("calatorule poti sa folosesti autobuzul");
        }else{
            super.getMijlocTransport().notifica(calator);
        }
    }
}
