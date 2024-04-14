package builder.Spital.main;


import builder.Spital.classes.Builder;
import builder.Spital.classes.BuilderSpital;
import builder.Spital.classes.Spital;

public class Main {
    public static void main(String[] args) {

        Spital spital1=new Spital(false,true,true,false);
        Spital spital2=new Spital(true,true,true,true);
        BuilderSpital spital3=new BuilderSpital().setHalat(true).setMic_dejun(true).setPapuci(true).setPat_rabatabil(true);
        System.out.println(spital1.toString());
        System.out.println(spital2.toString());
        System.out.println(spital3.toString());
    }
}
