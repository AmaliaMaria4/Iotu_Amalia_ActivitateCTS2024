package chain.pbFarmacie.classes;

public class AsistentFarmacie extends AngajatFarmacie{
    @Override
    public void proceseazaComanda(Comanda comanda) {
        if(comanda.getTipComanda().equals("Aducere medicamente")){
            System.out.println("Asistentul a fost trimis dupa medicamente");
        }
    }
}
