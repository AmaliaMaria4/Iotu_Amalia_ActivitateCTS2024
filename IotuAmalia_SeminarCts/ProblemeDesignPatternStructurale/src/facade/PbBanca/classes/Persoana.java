package facade.PbBanca.classes;

public class Persoana {
    private String cnp;
    private String nume;

    public Persoana(String cnp, String nume) {
        this.cnp = cnp;
        this.nume = nume;
    }

    //metoda de aflare varsta din cnp
    public int getVarsta(){
       int an=0;
       if(cnp.charAt(0)=='1'||cnp.charAt(0)=='2')
           an=(1900+Integer.parseInt(""+cnp.charAt(1)+cnp.charAt(2)));
        if(cnp.charAt(0)=='3'||cnp.charAt(0)=='4')
            an=(1800+Integer.parseInt(""+cnp.charAt(1)+cnp.charAt(2)));
        if(cnp.charAt(0)=='5'||cnp.charAt(0)=='6')
            an=(2000+Integer.parseInt(""+cnp.charAt(1)+cnp.charAt(2)));
        return  2021-an;
    }
    public String getCnp(){
        return cnp;
    }
    public String getNume(){
        return nume;
    }
}
