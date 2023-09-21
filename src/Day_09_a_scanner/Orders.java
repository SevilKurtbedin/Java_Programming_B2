package Day_09_a_scanner;

import java.util.Locale;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner key = new Scanner(System.in);

        System.out.print("Please enter the product name: ");
        String productName = key.nextLine();

        System.out.print("Enter a price for a " + productName + ": ");
        double price = key.nextDouble();

        System.out.print("How many " + productName + " do you want to bay? ");
        int quantity = key.nextInt();

        System.out.println();
        key.nextLine();
        System.out.print("What should put on your order name: ");
        String orderName = key.nextLine();

        double totalPrice = price * quantity;

        System.out.println(orderName + " your order for " + quantity + " " + productName + " has been placed.\n" +
                "Your total is: $" + totalPrice);


    }
}
