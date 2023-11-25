package Day_39_a_polymorphism.animal;

public class Reptile extends Animal {
    int numberOfClass;
    @Override
    public void eat () {
        System.out.println("Reptile is eating");
    }
}
