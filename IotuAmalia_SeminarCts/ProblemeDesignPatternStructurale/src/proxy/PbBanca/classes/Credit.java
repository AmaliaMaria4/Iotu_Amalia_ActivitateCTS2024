package proxy.PbBanca.classes;

public class Credit implements CreditAbstract{
    @Override
    public void oferaCredit(TipMoneda tipMoneda, float suma) {
        System.out.println(" s a oferit creditul cu suma de "+suma + tipMoneda);
    }
}
