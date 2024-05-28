package chain.pbFarmacie.classes;

public class Farmacist extends AngajatFarmacie{
    @Override
    public void proceseazaComanda(Comanda comanda) {
        if(comanda.getTipComanda().equals("Preluare")){
            System.out.println("Farmacistul a preluat o noua comanda");
        }else{
            super.getAngajatFarmacie().proceseazaComanda(comanda);
        }
    }
}
