package proxy.PbBanca.classes;

public class Proxy implements CreditAbstract{
    private CreditAbstract creditAbstract;

    public Proxy(CreditAbstract creditAbstract) {
        this.creditAbstract = creditAbstract;
    }


    //aici pun conditia
    @Override
    public void oferaCredit(TipMoneda tipMoneda, float suma) {
        if(tipMoneda==TipMoneda.RON){
            creditAbstract.oferaCredit(tipMoneda,suma);
        }else{
            System.out.println("Banca nu ofera credite in alta moneda");
        }
    }
}
