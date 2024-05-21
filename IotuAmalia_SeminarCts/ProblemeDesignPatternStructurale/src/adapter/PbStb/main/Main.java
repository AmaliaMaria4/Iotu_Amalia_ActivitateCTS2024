package adapter.PbStb.main;

import adapter.PbStb.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void valideazaBilet(ICompanieDeTransport companieDeTransport){
        companieDeTransport.cumparaBilet();
    }
    public static void main(String[] args) {
        ICompanieDeTransport companie=new Companie("Stb",1999,300);
        List<String> list=new ArrayList<>();
        list.add("Berceni");
        list.add("Piata Romana");
        list.add("Universitate");
        IMetrou metrou=new Metrou("Popescu",list,2);
        ICompanieDeTransport companieDeTransport=new CompanieMetrou(metrou);
        valideazaBilet(companieDeTransport);
    }
}
