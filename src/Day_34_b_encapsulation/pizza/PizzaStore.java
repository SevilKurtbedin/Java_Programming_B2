package Day_34_b_encapsulation.pizza;

import java.util.Scanner;

public class PizzaStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pizza size: ");
        String size = input.next();
        System.out.print("Number of toppings: ");
        int numberOfToppings = input.nextInt();
        Pizza pizzaOne = new Pizza(size, numberOfToppings);
        pizzaOne.calculatePrice();
        System.out.println(pizzaOne);
    }
}
