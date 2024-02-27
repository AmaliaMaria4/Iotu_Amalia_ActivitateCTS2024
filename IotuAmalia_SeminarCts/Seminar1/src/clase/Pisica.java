package clase;

public class Pisica extends Animal{
    public Pisica(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("the pet cat "+this.getName()+" eats "+food);
    }
}
