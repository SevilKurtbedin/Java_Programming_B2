package Day_30_b_custom_classes;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPeople {
    public static void main(String[] args) {
        // The next three lines  are just sample of object creation;
        Scanner input = new Scanner(System.in);
        Integer [] arr = new Integer[4];
        ArrayList <Integer> nums = new ArrayList<>();

        // Here I am creating an object of Person class;
        Person personOne = new Person();
        Person personTwo = new Person();

        personOne.name = "Sevil";
        System.out.println("Person One Name: " + personOne.name);
        personOne.age = 28;
        personOne.height = 5.9;
        personOne.isMarried = true;
        System.out.println("Peron One Age: " + personOne.age);
        System.out.println("Person One Height: " + personOne.height);
        System.out.println("Person One Is Married?: " + personOne.isMarried);

        System.out.println("___________________________________");

        personTwo.name = "Sophia";
        System.out.println("Person Two Name: " + personTwo.name);
        personTwo.age = 29;
        personTwo.height = 5.7;
        personTwo.isMarried = false;
        System.out.println("Peron Two Age: " + personTwo.age);
        System.out.println("Person Two Height: " + personTwo.height);
        System.out.println("Person Two Is Married?: " + personTwo.isMarried);

    }
}
