package composite.PbRestaurant.classes;

public interface ComponentaMeniu {
    public void adaugaNod(ComponentaMeniu componentaMeniu) throws Exception;
    public void stergeNod(ComponentaMeniu componentaMeniu);
    ComponentaMeniu getNod(int index);
    public void printeaza();
}
