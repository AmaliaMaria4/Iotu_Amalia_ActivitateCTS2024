package facade.PbFarmacie.classes;

public class Client {
    private boolean areReteta;
    private boolean areMedicamenteNecesare;
    private boolean areCardDeSanatate;

    public Client(boolean areReteta, boolean areMedicamenteNecesare, boolean areCardDeSanatate) {
        this.areReteta = areReteta;
        this.areMedicamenteNecesare = areMedicamenteNecesare;
        this.areCardDeSanatate = areCardDeSanatate;
    }

    public boolean areReteta() {
        return areReteta;
    }

    public boolean areMedicamenteNecesare() {
        return areMedicamenteNecesare;
    }

    public boolean areCardDeSanatate() {
        return areCardDeSanatate;
    }
    public void verificaAreCard(){
        if(areCardDeSanatate){
            System.out.println("clientul are card si poate achizitiona reteta");
        }else{
            System.out.println("clientul nu are card si nu poate achizitiona reteta");
        }
    }
}
