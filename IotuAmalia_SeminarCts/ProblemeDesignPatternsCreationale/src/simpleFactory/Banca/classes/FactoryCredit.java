package simpleFactory.Banca.classes;

public class FactoryCredit {
    public Credit createCredit(TipCredit tipCredit,float suma, float dobanda)throws Exception{
        switch (tipCredit){
            case CREDITIPOTECAR:
                return new CreditIpotecar(suma,dobanda);
            case CREDITNEVOIPERSOANLE:
                return new CreditNevoiPersonale(suma,dobanda);
            default:throw new Exception("tipul nu este returnat");
        }
    }
}
