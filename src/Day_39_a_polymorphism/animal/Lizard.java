package Day_39_a_polymorphism.animal;

public class Lizard extends Reptile {
    String skinColor;
    @Override
    public void eat () {
        System.out.println("Lizard is eating");
    }
}
