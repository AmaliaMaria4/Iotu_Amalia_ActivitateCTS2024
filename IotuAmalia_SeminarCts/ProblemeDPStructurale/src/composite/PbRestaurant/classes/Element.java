package composite.PbRestaurant.classes;



//nodul frunza
public class Element implements ComponentaMeniu {
    private String numeElement;

    public Element(String numeElement) {
        this.numeElement = numeElement;
    }

    @Override
    public void adaugaNod(ComponentaMeniu componentaMeniu) throws Exception{
        throw new Exception("nu este implementata");
    }

    @Override
    public void stergeNod(ComponentaMeniu componentaMeniu) {
        throw new IllegalArgumentException("nu este implementata");
    }

    @Override
    public ComponentaMeniu getNod(int index) {
        throw new IllegalArgumentException("nu este implementata");

    }

    @Override
    public void printeaza() {
        System.out.println("Elementul: "+numeElement);
    }
}
