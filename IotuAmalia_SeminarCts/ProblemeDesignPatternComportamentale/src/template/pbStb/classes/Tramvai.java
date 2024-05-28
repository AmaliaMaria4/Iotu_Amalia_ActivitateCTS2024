package template.pbStb.classes;

public class Tramvai extends MijlocTransportPeSine{
    public Tramvai(String numeSofer) {
        super(numeSofer);
    }


    @Override
    protected void opresteInStatie1() {
        System.out.println("soferul " +numeSofer+" oprire in statia 1");
    }

    @Override
    protected void opresteInStatie2() {
        System.out.println("oprire in statia 2");

    }

    @Override
    protected void opresteInStatie3() {
        System.out.println("oprire in statia 3");

    }
}
