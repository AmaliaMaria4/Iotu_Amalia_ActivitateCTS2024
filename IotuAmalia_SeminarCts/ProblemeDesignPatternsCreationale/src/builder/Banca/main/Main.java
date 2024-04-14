package builder.Banca.main;


import builder.Banca.classes.ContClient;
import builder.Banca.classes.ContClientBuilder;

public class Main {
    public static void main(String[] args) {
        ContClient contClient=new ContClientBuilder().setCardDeSalariu(true).setAreInternetBanking(true).setCardAtasat(true).build();
        System.out.println(contClient.toString());
    }
}

