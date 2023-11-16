package Day_34_c_inheritance.animals;

public class Zoo {
    public static void main(String[] args) {
        Animal animalOne = new Animal();
        animalOne.species = "Generic Animal";
        animalOne.numberOfLegs = 0;
        animalOne.walk();

        Dog dogOne = new Dog();
        dogOne.species = "Mukhtar";
        dogOne.numberOfLegs = 4;
        dogOne.bark(); // Dog is barking
        dogOne.walk(); // Mukhtar is walking

        Lion lionOne = new Lion();
        lionOne.species = "Arslan";
        lionOne.numberOfLegs = 4;
        lionOne.roar(); // Lion is roaring
    }
}
