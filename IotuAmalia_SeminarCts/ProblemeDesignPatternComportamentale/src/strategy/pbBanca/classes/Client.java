package strategy.pbBanca.classes;

public class Client {

    private IVerificareDocumente modVerificare;

    public Client(IVerificareDocumente modVerificare) {
        this.modVerificare = modVerificare;
    }



    public void setModVerificare(IVerificareDocumente modVerificare) {
        this.modVerificare = modVerificare;
    }

    public IVerificareDocumente getModVerificare() {
        return modVerificare;
    }
//    public void ajungeLaGhiseu() {
//        System.out.println("Clientul " + nume + " a ajuns la ghișeu.");
//        modVerificare.verificaDocumente();
//    }
}
