import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    //right
    public void getSexReturnF() {
        Persoana persoana1=new Persoana("Simona","6010407115189");
        assertEquals(persoana1.getSex(),"F");
    }

    @org.junit.Test
        //right
    public void getSexReturnM(){
        Persoana persoana2=new Persoana("Ion","5020412117689");
        assertEquals(persoana2.getSex(),"M");
    }

    @org.junit.Test
    //boundary-testeaza limitele //verific doar extremele
    public void getSexReturnLimitaInferioara(){
        Persoana persoana2=new Persoana("Ion","1020412117689");
        assertEquals(persoana2.getSex(),"M");
    }

    //inverse-nu se aplica la sex

    @org.junit.Test
    //cross check
    public void getSexParitate(){
        String cnp="1020412117689";
        Persoana persoana2=new Persoana("Andrei",cnp);
        String sex;
        if(Integer.valueOf(cnp.charAt(0))%2==0){
            sex=String.valueOf("F");
        }else{
            sex=String.valueOf("M");
        }
        assertEquals(persoana2.getSex(),sex);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
//error
    public void getSexErrorCnpStartWthNumberOutsideCases(){
        Persoana persoana=new Persoana("Andrei","9020412117689");
    persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
//error
    public void getSexErrorCnpStartWithInvalidCharacter(){
        Persoana persoana=new Persoana("Andrei","-020412117689");
        persoana.getSex();
    }

    @org.junit.Test(expected = NullPointerException.class)
//error
    public void getSexErrorCnpIsEmptyString(){
        Persoana persoana=new Persoana("Andrei"," ");
        persoana.getSex();
    }

    @org.junit.Test(timeout = 200)
//performance
    public void getSexPerformance(){
        Persoana persoana=new Persoana("Andrei","1020412117689");
        persoana.getSex();
    }

    @org.junit.Test
//correct
    public void getSexCorrect(){
        Persoana persoana=new Persoana("Andrei","1020412117689");
        assertEquals(1,persoana.getSex().length());

       }

    @org.junit.Test
//correct
    public void getSexByLetter(){
        Persoana persoana=new Persoana("Andrei","5020412117689");
        boolean isCorrect=persoana.getSex().toLowerCase().equals("M")||persoana.getSex().toLowerCase().equals("F");
       assertTrue(isCorrect);

    }
    @org.junit.Test
    public void getSexOrder(){
        //order
        Persoana persoana=new Persoana("Andrei","1020412117689");
        Persoana persoana1=new Persoana("Simona","6010407115189");
       boolean isCorrect= persoana.getSex().compareTo(persoana1.getSex())>0?true:false;
       assertTrue(isCorrect);
    }

    @org.junit.Test
    //range -in interior, limte, in afara
    public void getSexRange(){
        Persoana persoana=new Persoana("Andrei","1020412117689");
        assertEquals(true,persoana.getSex().equals("M"));
    }











    @org.junit.Test
    public void getVarsta() {
    }

    @org.junit.Test
    public void checkCNP() {
    }
}