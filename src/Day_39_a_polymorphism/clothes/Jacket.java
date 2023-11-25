package Day_39_a_polymorphism.clothes;

public class Jacket extends Clothes implements HasHood {
    @Override
    public void wear() {
        System.out.println("Wearing Jacket");
    }

    @Override
    public void punOfHood() {
        System.out.println("Putting in the jacket hood");
    }
}
