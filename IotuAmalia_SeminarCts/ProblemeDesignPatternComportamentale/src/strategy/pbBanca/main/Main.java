package strategy.pbBanca.main;

import strategy.pbBanca.classes.Client;
import strategy.pbBanca.classes.VerificarePersoanaFizica;
import strategy.pbBanca.classes.VerificarePersoanaJuridica;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(new VerificarePersoanaFizica());
        Client client2 = new Client(new VerificarePersoanaFizica());
        client1.getModVerificare().verificaDocumente();
        client2.getModVerificare().verificaDocumente();
        System.out.println();
        client1.setModVerificare(new VerificarePersoanaJuridica());
        client1.getModVerificare().verificaDocumente();

        client2.setModVerificare(new VerificarePersoanaJuridica());
        client2.getModVerificare().verificaDocumente();
    }
}
