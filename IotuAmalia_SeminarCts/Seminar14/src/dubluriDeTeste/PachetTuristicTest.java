package dubluriDeTeste;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PachetTuristicTest {

    //test corectitudine aplica discount
    @Test
    public void testeazaCorectitudineDiscount() {
        IPersoana client = new Persoana("ion", "1240301118276");
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Roma", 22.5);
        pachetTuristic.aplicaDiscountVarstnici(20);
        Assert.assertEquals(18.0, pachetTuristic.getPret(), 0.01);  //0.01 este marja de eroare //18 este rezultatul asteptat
    }

    @Test
    public void testAplicaDiscountBoundery() {
        IPersoana client = new Persoana("Dan", "1590304119392");
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 33.5);
        pachetTuristic.aplicaDiscountVarstnici(10);
        Assert.assertEquals(30.15, pachetTuristic.getPret(), 0.01);
    }

    @Test
    public void valoareAplicaDiscountFake() {
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(10);
        Assert.assertEquals(27, pachetTuristic.getPret(), 0.01);
    }

    @Test
    public void valoareNuAplicaDiscountFake() {
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(25);
        pachetTuristic.aplicaDiscountVarstnici(10);
        Assert.assertEquals(30, pachetTuristic.getPret(), 0.01);
    }

    @Test
    public void valoareAlicaDiscount100() {
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(100);
        Assert.assertEquals(0.0,pachetTuristic.getPret(),0.01);
    }
    @Test
    public void valoareAlicaDiscount0() {
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(100);
        Assert.assertEquals(30.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    public void valoareAlicaDiscount1() {
        PersoanaFake client = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Bucuresti", 30.0);
        client.setValoareGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(100);
        Assert.assertEquals(29.7,pachetTuristic.getPret(),0.01);
    }
}