package Day_39_a_polymorphism.clothes;

public class TShirt extends Clothes implements HasHood {

    @Override
    public void wear() {
        System.out.println("Wearing T-Shirt");
    }

    @Override
    public void punOfHood() {

    }
}
