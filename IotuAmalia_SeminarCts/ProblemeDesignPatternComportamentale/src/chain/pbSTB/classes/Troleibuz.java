package chain.pbSTB.classes;

public class Troleibuz extends MijlocTransport{
    @Override
    public void notifica(Calator calator) {
        if(calator.getDistanta()<=3){
            System.out.println("Calatorul poti sa folosesti troileibuzul pt ca distanta este mai mica decat 3 km!");
        }else{
            super.getMijlocTransport().notifica(calator);
        }
    }
}
