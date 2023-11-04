package Day_30_b_custom_classes;

public class Animal {
    String species;
    long population;

    @Override
    public String toString() {
        return "Animal name: " + species
        + "\nAnimal population: " + population;
    }
}
