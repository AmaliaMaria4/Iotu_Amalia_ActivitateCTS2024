package singletonLazy.classes;

public class ConexiuneBazaDate {
    private String nume;
    private int nrTabele;
    private String linkConectare;

    private static ConexiuneBazaDate instanta=null;
    private ConexiuneBazaDate(String nume, int nrTabele, String linkConectare) {
        this.nume = nume;
        this.nrTabele = nrTabele;
        this.linkConectare = linkConectare;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "ConexiuneBazaDate{" +
                "nume='" + nume + '\'' +
                ", nrTabele=" + nrTabele +
                ", linkConectare='" + linkConectare + '\'' +
                '}';
    }
    public static synchronized ConexiuneBazaDate getInstance(String nume, int nrTabele,String linkConectare ){
        if(instanta==null){
            instanta=new ConexiuneBazaDate(nume, nrTabele,linkConectare);
        }
        return instanta;
    }
}
