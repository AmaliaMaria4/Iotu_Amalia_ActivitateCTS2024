package chain.pbSTB.classes;

public class Tramvai extends MijlocTransport{
    @Override
    public void notifica(Calator calator) {
        if(calator.getDistanta()<=10&&calator.getDistanta()>=5){
            System.out.println("calatorule poti sa folosesti tramvaiul");
        }else {
            super.getMijlocTransport().notifica(calator);
        }
    }
}
