package singletonLazy.main;
import singletonLazy.classes.ConexiuneBazaDate;

public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDate conexiuneBazaDate1=ConexiuneBazaDate.getInstance("BazaDeDate1",412,"https://online.ase.ro/course1");
        ConexiuneBazaDate conexiuneBazaDate2=ConexiuneBazaDate.getInstance("BazaDeDate2",124,"https://online.ase.ro/course2");
        System.out.println(conexiuneBazaDate1.toString());
        System.out.println(conexiuneBazaDate2.toString());
        conexiuneBazaDate1.setNume("BazaDeDateNoua1");
        conexiuneBazaDate2.setNume("BazaDeDateNoua2");
        System.out.println(conexiuneBazaDate1.toString());
        System.out.println(conexiuneBazaDate2.toString());
        }
    }
