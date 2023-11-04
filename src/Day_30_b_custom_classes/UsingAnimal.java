package Day_30_b_custom_classes;

public class UsingAnimal {
    public static void main(String[] args) {
        Animal animalOne = new Animal();
        animalOne.species = "birds";
        animalOne.population = 1_000_000_000L;
        System.out.println(animalOne.species); // birds;
        System.out.println(animalOne.population); // 1000000000;

//      If we want to print out the object directly, we must declare a method called
//      .toString() in the class;
        System.out.println("____________________________");
        System.out.println(animalOne.toString());
    }
}
